import java.util.Stack;

public class MyQueueWithStack {
Stack<String> stack1=new Stack<>();
Stack<String> stack2=new Stack<>();
public void Enqueue(String item){
    while (!stack1.isEmpty()){
        stack2.push(stack1.pop());
    }
    stack1.push(item);
    while (!stack2.isEmpty()){
        stack1.push(stack2.pop());
    }
}
public String Dequeue(){

    return stack1.pop();
}
}