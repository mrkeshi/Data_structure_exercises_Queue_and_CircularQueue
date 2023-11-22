public class quee {
    public int rear=0,front=0,size=10;
    public int[] queue=new int[size];
    public void display(){
        for (int x:queue){
            System.out.println(x);
        }
    }
    public void add(int data){
        queue[rear++]=data;
    }
    public void remove(){
        front++;
    }
    public boolean isempyt(){
        if (front==0) return true;
        return false;
    }
    public boolean isfull(){
        if (rear==size) return true;
        return false;
    }
}
