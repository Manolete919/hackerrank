package com.hacker.youtube;
// https://www.youtube.com/watch?v=wjI1WNcIntg&t=181s

public class Queue {
	
	// (ticket) head ------- tail 
	// add to the head, remove from the head
	
	private Node head; // remove from the head. It means attended!!
	private Node tail; // add things here... (more customers)
	//private Node test;
	
	private static class Node {
		private int data;
		private Node next;
		private Node(int data) {
			this.data = data;
		}
		
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	public int peek() {
		return head.data;
	}
	
	public void add(int data) {
		
		// first create the node
		Node node = new Node(data);
		
		if(tail != null ) {
			// a la referencia tail, actulizarla insertando otro nodo
			// las referencias, son anidadas, no hay asignacion directa
			tail.next = node;
		}

		//objetemos la ultima referencia
		tail = node;
		

		// la primera ver marcamos la cabecer
		if( head == null) {
			head = node;
		}
		
			
		
		
	}
	
	/*public void remove(int data) {
		int data = head.data;
	}*/
	
	public void print() {
		Node print = head;
		if(print != null ) {
			while(print.next != null) {
				print = print.next;				
			}
		}
		
	}

}
