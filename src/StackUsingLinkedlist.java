public class StackUsingLinkedlist {
    Node Top;

    public void push(int data){
        Node temp=new Node(data);
        temp.next=Top;
        Top=temp;
    }
    public int pop() throws Exception {
    if (Top ==null ) throw new Exception("stack is empty");
        int x=Top.value;
        Top=Top.next;
        return x;
    }
    public int peek(){
        return Top.value;
    }
    public void display()
    {
        // check for stack underflow
        if (Top == null) {
            System.out.printf("\nStack Underflow");

        }
        else {
            Node temp = Top;
            while (temp != null) {

                // print node data
                System.out.print(temp.value);

                // assign temp link to temp
                temp = temp.next;
                if(temp != null)
                    System.out.print(" -> ");
            }
        }
    }
    public boolean isEmpty() { return Top == null; }

}
