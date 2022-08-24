package com.lm.stack;

import java.util.Stack;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hyderabad";
		System.out.println("Before "+ str);
		System.out.println("After "+ reverse(str));
	}

	private static String reverse(String str) {
		// TODO Auto-generated method stub
		Stack<Character> stack = new Stack<>();
		char[] ch = str.toCharArray();
		
		for(char c : ch) {
			stack.push(c);
		}
		for(int i=0;i<str.length();i++) {
			ch[i]=stack.pop();
		}
		return new String(ch);
	}
}
