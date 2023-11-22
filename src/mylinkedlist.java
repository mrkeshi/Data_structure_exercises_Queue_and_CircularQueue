public class mylinkedlist {
    public Node head=null;
    public void PrintLinkedList(){
        Node cr=head;
        while (cr!=null){
            System.out.println(cr.value);
            cr=cr.next;
        }
    }
    public void insertFirst(int data){
        Node newnode=new Node(data);
        if (head==null) {head=newnode;
        }else {
            newnode.next = head;
            head = newnode;
        }

    }
    public void insertAfterP(Node p,int data){
        Node newnode=new Node(data);
        newnode.next=p.next;
        p.next=newnode;
    }
    public  void insertAfter(int data){
        if (head==null){
            head=new Node(data);
            return;
        }
        Node Current=head;
        while (Current.next!=null){
            Current=Current.next;
        }
        Node newnode=new Node(data);
        Current.next=newnode;
    }
    public void deleteFirst(){
        head=head.next;
    }
    public void deleteEven(){
        Node Current=head;
        while (Current.next!=null){
            if (Current.next.value%2==0){
                Current.next=Current.next.next;
            }else{
                Current=Current.next;
            }

            }

    }
}
