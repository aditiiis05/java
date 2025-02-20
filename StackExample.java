import java.util.*;

class Stack {
    private LinkedList<Integer> stack;

    public Stack() {
        stack = new LinkedList<>();
    }

    public void push(int item) {
        stack.addFirst(item); 
    }

    public int pop() {
        if (!isEmpty()) {
            return stack.removeFirst();  
        }
        System.out.println("Stack is empty");
        return -1; 
    }
    public int peek() {
        if (!isEmpty()) {
            return stack.getFirst(); 
        }
        System.out.println("Stack is empty");
        return -1;
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int size() {
        return stack.size();
    }

    public void display() {
        System.out.println(stack);
    }
}

public class StackExample {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        
        System.out.println("Stack after push operations:");
        stack.display();
        
        System.out.println("Popped item: " + stack.pop());
        
        System.out.println("Stack after pop operation:");
        stack.display();
    }
}
