import java.util.Stack;

public class MyQueueWithStack {
Stack<String> stack1=new Stack<>();
Stack<String> stack2=new Stack<>();
public void Enqueue(String item){
    stack1.push(item);
}
public void Dequeue(){
    while (!stack1.isEmpty()){
        stack2.push(stack1.pop());
    }
    stack2.pop();
}
}