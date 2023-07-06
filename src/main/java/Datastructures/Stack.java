package Datastructures;

public class Stack {
    private int maxSize;
    private int top;
    private int[] stackArray;

    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int value) {
        if (top < maxSize - 1) {
            stackArray[++top] = value;
            System.out.println("Inserted " + value);
        } else {
            System.out.println("Stack is full!");
        }
    }

    public void pop() {
        if (top >= 0) {
            System.out.println("Removed " + stackArray[top--]);
        } else {
            System.out.println("Stack is empty!");
        }
    }

    public int peek() {
        if (top >= 0) {
            return stackArray[top];
        } else {
            System.out.println("Stack is empty!");
            return -1;
        }
    }

    public boolean isEmpty() {
        return (top == -1);
    }


    public static void main(String[] args) {
        Stack stack = new Stack(3);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println("Top element is " + stack.peek());

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
    }

}