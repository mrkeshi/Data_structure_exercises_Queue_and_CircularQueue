public class circlequeeu {
    public int rear=0,front=0;
    public int size=6;
    public int[] cq=new int[size];

    public void addq(int data){
        if (!isempty()){
            cq[rear]=data;
            rear=(rear+1)%size;
        }else {
            System.out.println("queue is full");
        }
    }
    public void dequeu(){
        if (!isFull()){
            front=(front+1)%size;
        }
    }
    public boolean isempty(){
        if (rear==front) return true;
        return false;
    }
    public boolean isFull(){
        if ((rear+1%size)==front){
            return true;
        }
        return false;
    }
}
