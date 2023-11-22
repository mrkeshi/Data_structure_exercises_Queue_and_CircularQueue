public class twowayLinked {
    public Node head;

    public void PrintLinkedList(){
        Node cr=head;
        while (cr!=null){
            System.out.println(cr.value);
            cr=cr.next;
        }
    }
    public void insert(int data){
        Node cr=head;
        Node newNode=new Node(data);
        if (cr==null){
        head=newNode;
        }else{
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
        }
    }
    public void deleteFirst(){
        head.next.prev=null;
        head=head.next;
    }
//    public void insertAfter(int d){
//        Node cr=head;
//        while (cr.next!=null){
//            cr=cr.next;
//        }
//        cr.next=new Node(d);
//    }

    public void insertAfter(int num,int p){
       Node Current=head;
       Node newNode=new Node(num);
       while (Current!=null){
           if (Current.value==p){

                   newNode.next=Current.next;
                   Current.next=newNode;
                   newNode.prev=Current;
               Current=Current.next;

           }else {
               Current=Current.next;
           }
       }
    }
    public void deleteEven(){
        Node current=head;
        while (current!=null){
            if (current.value%2==0){

                Node q=current;
                if (current.next!=null){
                    current.next.prev=current.prev;
                }
                if (current.prev!=null){
                    current.prev.next=current.next;
                }
                current=current.next;
                q=null;

            }else {
                current=current.next;
            }
        }

    }

    public void depP(Node p){
        p.next.next.prev=p;
        p.next=p.next.next;
    }
}
