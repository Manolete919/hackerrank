package com.hacker.reference;

public class Main {
	
	//https://stackoverflow.com/questions/40480/is-java-pass-by-reference-or-pass-by-value
	static class Foo {
		String attribute;
		Foo(String name){
			this.attribute = name;
		}
		public String getAttribute() {
			return attribute;
		}
		public void setAttribute(String attribute) {
			this.attribute = attribute;
		}
		
		
	}
	
    public static void main(String[] args) {
         Foo f = new Foo("f");
         changeReference(f); // It won't change the reference!
         System.out.println("reasigne f dentro del metodo: " + f.getAttribute());
         //modifyReference(f); // It will modify the object that the reference variable "f" refers to!
         //System.out.println("modifique f dentro del metodo " + f.getAttribute());
    }

    public static void changeReference(Foo a) {
    	a.setAttribute("general pajarito");
         Foo b = new Foo("b");
         a = b;
         a.setAttribute("otra prueba dentro del metodo");
         
    }

    public static void modifyReference(Foo c) {
         c.setAttribute("c");
    }

}
