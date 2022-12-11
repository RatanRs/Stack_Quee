package com.bridgelabz;
/***
 * 
 * @author Admin
 *
 */

public class Queue {
	LinkedList list = new LinkedList();
	public void enQueue(Object data)
	{
		list.addFirstNode(data);
	}
	public void display()
	{
		list.display();
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to Stack and Queue Data structure");
		Queue queue = new Queue();
		queue.enQueue(70);
		queue.enQueue(30);
		queue.enQueue(56);
		queue.display();
	}
}