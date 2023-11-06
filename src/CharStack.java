public class CharStack {
    private int maxSize;
    private int top;
    private char[] stack;

    public CharStack() {
        maxSize = 20;
        top = 0;
        stack = new char[maxSize];
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    public void push(char value) {
        if (!isFull()) {
            stack[top++] = value;
        } else {
            System.out.println("stack is full");
        }
    }

    public char pop() {
        if (!isEmpty()) {
            return stack[--top];
        } else {
            System.out.println("stack is empty");
            return '\0'; //
        }
    }

    public char peek() {
        if (!isEmpty()) {
            return stack[top - 1];
        } else {
            return '\0';
        }
    }

    public int size() {
        return top;
    }

}
