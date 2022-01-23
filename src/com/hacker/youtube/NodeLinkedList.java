package com.hacker.youtube;
// https://www.youtube.com/watch?v=njTh_OwMljA
public class NodeLinkedList {
	
	NodeLinkedList next;
	int data;
	public NodeLinkedList(int data) {
		this.data = data;
	}
	


}

// Intantion head is null, but after using its method, head will hold the last value
class LinkedList {
	
	NodeLinkedList head;
	
	public void append(int data) {
		
		if(head == null) {
			// se inicializa, y se devuelve. Esto la primera vez
			head = new NodeLinkedList(data);
			return;
		}
		
		NodeLinkedList current = head;
		
		
		
		while(current.next != null) {
		
			current = current.next;
			
		}
		//lo agrega al final
		// current.next correspnde a la ultima referencia
		// current es el ultimo objeto
		current.next = new  NodeLinkedList(data);
		
		
	}
	
	public void prepend(int data) {
		NodeLinkedList newHead = new NodeLinkedList(data);
		//link to the old head
		newHead.next = head;
		// head now it is the new one
		head = newHead;
	}
	
	public void deleteWithValue(int data) {
		
		if(head == null) return;
		if(head.data == data) {
			head = head.next;
			return;
		}
		// starting at the head value
		NodeLinkedList current = head;
		// walk up until the value is the one 
		while(current.next != null) {
			if(current.next.data == data) { 
				// it is gonna stop one before we want to delete
				// walk around it
				current.next = current.next.next;
				return;
			}
			current = current.next;
		}
	}
	
	public void printAll(){
		NodeLinkedList print = head;
		while(print.next != null) {
			System.out.println(print.next.data);
			print  = print.next;
		}
	}
}
