public class LinkedList {
    public Node head=null;
    public Node CurrentNode=null;

    public void PrintLinkedList(){
        Node cr=head;
        while (cr!=null){
            System.out.println(cr.value);
            cr=cr.next;
        }
    }
    public void Insert(int d){
        if (head==null){
            head=new Node(d);
            return;
        }
        Node Current=head;
        while (Current.next!=null){
            Current=Current.next;
        }
        Current.next=new Node(d);

    }
    public void DeleteFirst(){
        Node Prev=null;
        head=head.next;
    }
    public void DeleteWithValue(int data){
        if (head==null) return;
        Node Current=head;
        while (Current.next!=null){
            if (Current.next.value==data){
                Current.next=Current.next.next;
            }
            Current=Current.next;
        }
    }

//    public Node SearchByKey(int data){
//        Node Cr=head;
//        while (Cr!=null){
//        if (Cr.value==data){
//        //
//        }
//        }
//        return 000;
//    }
    public void reverse(){
        Node previous = null;
        Node Current=head;
        while (Current!=null){
            Node nextElement=Current.next;
            Current.next=previous;
            previous=Current;
            Current=nextElement;
        }
    head=previous;



    }
}
