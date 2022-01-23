package com.hacker.youtube;

public class Stack {
	
	private static class Node{
		private int data;
		private Node next;
		private Node (int data) {
			this.data = data;
		}
	}
	private Node top;

	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.printAll();
		

	}
	
	public void push(int data) {
		
		Node newTop = new Node(data); 
		if(top == null) {
			top = newTop;
			return;
		}
				
		newTop.next = top;
		top = newTop;
		
	}
	
	public void printAll() {
		Node print = top;
		print.data = 80;
		System.out.println(top.data);
		while(print.next != null) {
			System.out.println(print.data);
			print = print.next;
		}
	}
	
	public int pop() {
		int data = top.data;
		top = top.next;
		return data;
	}
	
	

}
