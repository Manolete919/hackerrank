package com.hacker.reference;

public class TestReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*MyClass reference1 = new MyClass();
		MyClass reference2 = reference1;
		
		//si cambio referencia2 con otro valor, se ve afectado
		reference2 = new MyClass();
		reference2.setName("manuel");
		
		System.out.println("refenece1 " + reference1.getName());*/
		
		
		MyClass reference1 = new MyClass("manuel");
		
		MyClass reference2 = reference1;
		//mientras referenca2 no se inicialize, referencia1 puede ver
		reference2.next = new MyClass("carlos");
		reference2.next.next = new MyClass("Juan");
		
		System.out.println("refenece1 " + reference1.getName());
		System.out.println("refenece1 " + reference1.next.getName());
		System.out.println("refenece1 " + reference1.next.next.getName());
		
		reference2 = new MyClass("luiz");
		
		System.out.println("refenece1 " + reference1.getName());
		System.out.println("refenece1 " + reference1.next.getName());
		System.out.println("refenece1 " + reference1.next.next.getName());
		

	}

}
