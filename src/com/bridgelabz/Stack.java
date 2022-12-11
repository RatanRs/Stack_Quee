package com.bridgelabz;

public class Stack {
	LinkedList list = new LinkedList();

	public void push(Object data) {
		list.addLast(data);
	}

	public void print() {
		list.print();
	}

	/*
	 * Program execution starts from main method
	 */
	public static void main(String[] args) {
		System.out.println("Welcome to the LinkedList Stack and Queue Program");
		Stack stack = new Stack();
		stack.push(56);
		stack.print();
		stack.push(30);
		stack.print();
		stack.push(70);
		stack.print();
	}

}
