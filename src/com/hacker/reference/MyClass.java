package com.hacker.reference;

public class MyClass {
	String name;
	MyClass next;
	

	public MyClass(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MyClass getNext() {
		return next;
	}

	public void setNext(MyClass next) {
		this.next = next;
	}
	
	

}
