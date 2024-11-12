/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package linearr;

public class Stack {
    private int maxSize;      // Maximum size of the stack
    private int[] stackArray; // Array to store stack elements
    private int top;          // Index of the top element

    // Constructor to initialize the stack
    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1; // Stack is initially empty
    }

    // Push 
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push " + value);
        } else {
            stackArray[++top] = value; // Increment top and add value
            System.out.println("Pushed " + value);
        }
    }

    // Pop element
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop");
            return -1;
        } else {
            return stackArray[top--]; // Return top element and decrement top
        }
    }

    // Peek 
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Nothing to peek");
            return -1;
        } else {
            return stackArray[top];
        }
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return (top == -1);
    }

    // Check if the stack is full
    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5); // Create a stack of size 5

        stack.push(50);
        stack.push(24);
        stack.push(78);
        System.out.println("Top element is " + stack.peek());
        stack.pop();
        System.out.println("Top element after pop is " + stack.peek());
    }
}
