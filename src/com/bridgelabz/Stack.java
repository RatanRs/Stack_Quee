package com.bridgelabz;
/***
 * 
 * @author Admin
 *
 */

public class Stack {
		LinkedList list = new LinkedList();
	public void push(Object data)
	{
		list.addLast(data);
	}
	public void pop()
	{
		list.deleteFirst();
	}
	public void print()
	{
		list.print();
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Stack and Queue Data structure");
		Stack stack = new Stack();
		stack.push(56);
		stack.push(30);
		stack.push(70);
		stack.print();
		stack.pop();
		stack.print();
		stack.pop();
		stack.print();
		stack.pop();
		stack.print();
	}

}
