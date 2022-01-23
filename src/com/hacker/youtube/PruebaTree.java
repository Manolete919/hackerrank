package com.hacker.youtube;

public class PruebaTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node node = new Node(10);
		node.insert(5);
		node.insert(15);
		node.insert(8);		
		//node.printInOrder();
		//node.printPreOrder(); 
		node.printPostOrder();
	}
	


}
