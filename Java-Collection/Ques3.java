import java.util.Stack;

class StackOperations {

    private Stack<Integer> stack;
    private Stack<Integer> minStack;
    private int capacity;

    public StackOperations(int capacity) {
        this.capacity = capacity;
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        if(isFull()) {
            System.out.println("Stack is full");
        }
        stack.push(x);
        if(minStack.isEmpty() || minStack.peek() >= x) {
            minStack.push(x);
        } else {
            minStack.push(minStack.peek());
        }
    }

    public int pop() {
        if(isEmpty()) {
            System.out.println("Stack is Empty");
        }
        minStack.pop();
        return stack.pop();
    }

    public int getMin() {
        if(minStack.isEmpty()) {
            System.out.println("Stack is Empty");
        }
        return minStack.peek();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public boolean isFull() {
        return stack.size() == capacity;
    }
}

public class Ques3 {
    public static void main(String[] args) {

        StackOperations stack = new StackOperations(5);
        stack.push(11);
        stack.push(25);
        stack.push(12);
        stack.push(7);

        System.out.println("Min element: " + stack.getMin());
        stack.pop();
        System.out.println("Min element: " + stack.getMin());
    }
}