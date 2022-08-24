package com.lm.stack;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackLinkedListImplementation {
	private Node top;
	private int size;
	
	public static void main(String[] args) {
		StackLinkedListImplementation obj = new StackLinkedListImplementation();
		
		obj.push(2);
		obj.push(9);
		obj.push(39);
		obj.push(58);
		obj.push(4);
		obj.push(20);
		
		System.out.println(obj.size);
		System.out.println(obj.isEmpty());

		
		System.out.println(obj.peek());
		System.out.println(obj.pop());
		
		System.out.println(obj.size);
	}
	
	private class Node{	
		private int data;
		private Node next;
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
		public void push(int data) {
			Node tempNode = new Node(data);
			tempNode.next = top;
			top = tempNode;
			size++;
		}
		public int pop() {
			if(isEmpty()) {
				throw new EmptyStackException();
			}
			int result = top.data;
			top = top.next;
			size--;
			return result;
		}
			public boolean isEmpty() {
				return size ==0;
			}
			public int peek() {
				if(isEmpty()) {
					throw new EmptyStackException();
				}
				return top.data;
		}	
	}