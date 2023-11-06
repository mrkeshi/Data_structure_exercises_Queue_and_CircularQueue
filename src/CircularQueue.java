public class CircularQueue {
    public  int MaxSize=7;
    public int rear=0;
    public int front=0;
    public int[] queue=new int[MaxSize];
    public void Enqueue(int num){
        if (!isFull()){
            rear=(rear)%MaxSize;
            queue[rear++]=num;
        }else {
            System.out.println("Full!!!!!!");
        }
    }
    public void Dequeue(){
        if (!isEmpty()){
            front++;
        }else {
            System.out.println("Empty!!!");
        }
    }
    public int peek(){
        return queue[front];
    }

    public boolean isFull(){
        if ((rear+1)%MaxSize==front){
            return true;
        }
        return false;
    }
    public boolean isEmpty(){
        if(rear==front){
            return true;
        }
        return false;
    }
}
