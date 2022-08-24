package com.lm.stack;

public class StackArrayImplementation {
	int top;
	int capacity;
	static int [] stack;
	
	public StackArrayImplementation() {
		// TODO Auto-generated constructor stub
		top =-1;
		capacity = 10;
		stack = new  int[capacity];
	}
	public boolean isEmpty() {
			
		return top== -1;
	}
	public boolean isFull() {
		return top == capacity -1;
	}
	public int push(int data) {
		if(isFull())
		{
			System.out.println("Stack is full ");
		}
		return stack [++top] = data;
	}
	public int pop() {
		if(isEmpty()) 
		{
			System.out.println("Stack is empty ");
		}
		return stack[top--];
	}
	public int peek() {
		return stack[top];
	}
	public static void main(String[] args) {
		StackArrayImplementation obj = new StackArrayImplementation();
		
		obj.push(23);
		obj.push(19);
		obj.push(39);
		obj.push(50);
		
		System.out.println(obj.peek());
		System.out.println(obj.pop());
//		System.out.println(obj.isEmpty());
//		System.out.println(obj.isFull());
		for(int x : stack)
			System.out.println(x);
		System.out.println(obj.peek());
	}
}
