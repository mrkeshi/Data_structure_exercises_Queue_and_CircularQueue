public class MyQueue {
    int rere=0;
    int front=0;
    int size=20;
    int[] myqueue=new int[size];

    public boolean isfull(){
        if (rere==size) return true;
        return false;
    }
    public boolean isempty(){
        if (front<0 || front>=rere){
            return true;
        }
        return false;
    }
    public int peek(){
        return myqueue[front];
    }
    public void Enqueue(int ali) throws Exception {
        if(isfull()) throw new Exception("queue is full");
        myqueue[rere++]=ali;
    }
    public void Dequeue() throws Exception {
        if (isempty()) throw new Exception("queue is empty");
        front--;
    }

}
