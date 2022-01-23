package com.hacker.youtube;

public class Node {
	Node left, right;
	int data;
	
	public Node(int data) {
		this.data = data;
	}
	
	public void insert(int value) {
		
		
		
		if(value <= data) {
			System.out.println(value + " <= " + data + " IZQUIERDO");
			if(left == null) {				
				left = new Node(value);
			}else {
				left.insert(value);
			}
		}else {
			System.out.println(value + " > " + data + " DERECHO");
			if(right == null) {				
				right = new Node(value);				
			}else {
				right.insert(value);
			}
		}
		
	}
	
	public boolean contains(int value) {
		
		if(value == data) {
			return true;
		}else if (value < data){
			//no hay nodo
			if(left == null) {
				return false;
			}else {
				left.contains(value);
			}
			return true;
		}else {
			if(right == null) {
				return false;
			}else {
				right.contains(value);
			}
		}
		
		return false;
	}
	
	
	public void printInOrder() {
		if(left != null) {
			left.printInOrder();
		}
		System.out.println(data);
		if(right != null) {
			right.printInOrder();
		}
		
	}
	
	// root gets printed first, print the left substree
	public void printPreOrder() {
			
		//primero la raiz
		System.out.println(data);
		
		//imprime todo lo de la izquiera, sin no hay imprima la derecha
		if(left != null) {
			left.printPreOrder();
		}
		
		if(right != null) {
			right.printPreOrder();
		}
			

	}
	
	
	public void printPostOrder() {
		

		//imprime todo lo de la izquiera, sin no hay imprima la derecha
		if(left != null) {
			left.printPostOrder();
		}
		
		if(right != null) {
			right.printPostOrder();
		}
		
		System.out.println(data);	
			

	}

}
