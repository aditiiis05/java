interface StackInterface {
    void push(int item);
    int pop();
    int peek();
    boolean isEmpty();
}

class StackImpl implements StackInterface {
    private static final int MAX_SIZE = 10;
    private int[] stack;
    private int top;

    public StackImpl() {
        stack = new int[MAX_SIZE];
        top = -1;
    }

    public void push(int item) {
        if (top == MAX_SIZE - 1) {
            System.out.println("Stack Overflow! Cannot push " + item);
            return;
        }
        stack[++top] = item;
        System.out.println("Pushed: " + item);
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! Cannot pop.");
            return -1;
        }
        return stack[top--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return stack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }
}

public class Main {  
    public static void main(String[] args) {  
        StackImpl stack = new StackImpl();  

        stack.push(10);  
        stack.push(20);  
        stack.push(30);  

        System.out.println("Top element: " + stack.peek());  
        System.out.println("Popped: " + stack.pop());  
        System.out.println("Peek: " + stack.peek());  

        System.out.println("Is stack empty? " + stack.isEmpty());  

        stack.pop();  
        stack.pop(); // This should print "Stack Underflow! Cannot pop."  
    }  
}
