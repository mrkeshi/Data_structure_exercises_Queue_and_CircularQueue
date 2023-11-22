import java.util.Stack;

public class StackTraning {
    public  int size=10;
    public Stack<Integer> mainstack= new Stack();
    public int[] stack=new int[size];
    public int top=0;

    public void push(int data){
        if (top==size){
            System.out.println("stack is full");
        }else{
            stack[top++]=data;
        }
    }
    public int pop() throws Exception {
        if (top==0){
            throw new Exception("stack is empty");
        }else{
            return stack[--top];

        }
    }
    public void display() {
        for (int x : stack) {
            System.out.println(x);
        }
    }
    public int oprationPostfix(String phrase){
        for (int i=0;i<phrase.length();i++){
            char c=phrase.charAt(i);
            if (Character.isDigit(c)){
                mainstack.push(Character.getNumericValue(c));
            }else {
                push(DetermineStack(mainstack.pop(),mainstack.pop(),c));
            }
        }
        return mainstack.pop();
    }
        public int DetermineStack(int num1,int num2,char operator){
            switch (operator){
                case '-':
                    return   num2 - num1;
                case '*':
                    return   num1 * num2;
                case '/':
                    return   num2 / num1;
                default:
                    return   num1 + num2;

            }

        }
    public static void main(String[] args) throws Exception {
    StackTraning mystack=new StackTraning();
    mystack.push(1);
    mystack.push(2);
    mystack.push(3);
    mystack.push(4);
    mystack.push(5);
    mystack.psr();


    }
    public void psr() throws Exception {
        while (top>0){
            int x=pop();
            psr();
            System.out.println(x);
        }
    }

}
