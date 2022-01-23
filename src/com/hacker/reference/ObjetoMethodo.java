package com.hacker.reference;

public class ObjetoMethodo {
	
	static class MyObjeto  implements Cloneable {	
		public MyObjeto (String nombre){
			this.nombre = nombre;
		}
		String nombre;
		
		@Override
		protected Object clone() throws CloneNotSupportedException {
			// TODO Auto-generated method stub
			return super.clone();
		}	
		
		
	}
	
	public void alterObjeto(MyObjeto myObjeto, String nombre) throws CloneNotSupportedException {
		// work on the same adress
		//myObjeto.nombre = nombre;
		
		MyObjeto reference = (MyObjeto) myObjeto.clone();
		
		//MyObjeto reference = myObjeto;
		 
		
		//change the adress
		//myObjeto = new MyObjeto("");
		// working in another address
		//myObjeto.nombre = "juan";
		
		reference.nombre = "luis";
		
	}
	
	public void alterVariable(int variable) {
		// https://www.cs.virginia.edu/~jh2jf/courses/cs2110/java-pass-by-value.html
		// point to another address
		variable = 20;
		System.out.println("variables " + variable);
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		ObjetoMethodo objetoMethodo = new ObjetoMethodo();
		
		MyObjeto myObjeto = new MyObjeto("Manuel");
		
		objetoMethodo.alterObjeto(myObjeto, "Juan");
		
		System.out.println(myObjeto.nombre);
		
		int myVariable = 5;
		objetoMethodo.alterVariable(myVariable);
		System.out.println(myVariable);
		

	}

}
