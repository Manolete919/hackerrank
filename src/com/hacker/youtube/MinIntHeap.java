package com.hacker.youtube;

import java.util.Arrays;

// https://www.youtube.com/watch?v=t0Cq6tVNRBA
public class MinIntHeap {
	private int capacity = 10;
	private int size = 0;
	
	int[] items = new int[capacity];
	
	private int getLeftChildIndex(int partentIndex) {return  2 * partentIndex  + 1; }
	private int getRightChildIndex(int partentIndex) {return  2 * partentIndex  + 2; }
	private int getParentIndex(int childIndex) {return  (childIndex - 1)/2; };
	
	private boolean hasLeftChild(int index) { return getLeftChildIndex(index) < size;}
	private boolean hasRightChild(int index) { return getRightChildIndex(index) < size;}
	private boolean hasParent(int index) { return getParentIndex(index) >= 0 ;}


	private int leftChild(int index) { return items[getLeftChildIndex(index)]; }
	private int rightChild(int index) { return items[getRightChildIndex(index)]; }
	private int parent(int index) { return items[getParentIndex(index)]; }
	
	private void swap(int indexOne, int indexTwo) {
		int temp = items[indexOne];
		items[indexOne] = items[indexTwo];
		items[indexTwo] = temp;
	}
	
	// if the array is full, it creates an new array of double of that size
	private void ensureExtraCapacity() {
		if(size == capacity) {
			items = Arrays.copyOf(items, capacity*2);
			capacity *= 2;
		}
	}
	
	public int peek() {
		if(size == 0 ) throw new IllegalStateException();
		return items[0];
	}
	
	public int poll() {
		if(size == 0 ) throw new IllegalStateException();
		int item = items[0];
		//move el ultimo elemento al primer valor del array
		items[0] = items[size -1];
		size --;
		heapifyDown();
		return item;
	}
	

	public void add(int item) {
		ensureExtraCapacity();
		// agregar en el ultimo 
		items[size] = item;
		heapifyUp();
		
	}
	private void heapifyDown() {
		int index = 0; 
		while (this.hasLeftChild(index)) {
			int smallerChildIndex = this.getLeftChildIndex(index);
			if(this.hasRightChild(index) && this.rightChild(index) < this.leftChild(index)) {
				smallerChildIndex = this.getRightChildIndex(index);
			}
			
			if(items[index] < items[smallerChildIndex]) {
				break;
			}else {
				swap(index,smallerChildIndex);
				
			}
			index = smallerChildIndex;
			
		}
		
	}
	private void heapifyUp() {
		int index = size - 1;
		while (hasParent(index) && parent (index) > items[index]) {
			swap(this.getParentIndex(index),index);
			index = this.getParentIndex(index);
		}
		
	}
	

}
