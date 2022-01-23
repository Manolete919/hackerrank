package com.hacker.youtube;

public class TestQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue queue = new Queue();
		queue.add(10);
		// head node, tail node - 10
		queue.add(5);
		//10 -> 5
		queue.add(1);
		queue.add(4);
		queue.add(8);
		
		queue.print();
		

	}

}
