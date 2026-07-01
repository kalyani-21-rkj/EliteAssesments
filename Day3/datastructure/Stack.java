package datastructure;

public class Stack {

    private int[] stack;
    private int top;
    private int size;

    public Stack(int size) {
        this.size = size;
        stack = new int[size];
        top = -1;
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack Overflow");
            return;
        }

        stack[++top] = value;
        System.out.println(value + " pushed into stack");
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }

        return stack[top--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }

        return stack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }

        System.out.println("Stack Elements:");

        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }
}