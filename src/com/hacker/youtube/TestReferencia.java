package com.hacker.youtube;

public class TestReferencia {
	
	NodoReference head;
	NodoReference last;
	
	
	public void test() {
		
		/*NodoReference objeto = new NodoReference(10);
		
		 
		head = objeto;
		last = objeto;
		//referencia2 = objeto2;
		NodoReference objeto2 = new NodoReference(99);
		last.next = objeto2;
		// head = last, por lo tanto ambos se modifican
		// head = objeto.objeto2
		// last = objeto.objeto2
		
		// head = objeto->objeto2
		// last = objeto->objeto2  
		
		last = objeto2;
		// last = objeto2
		// last -> objeto2
		
		//-----
		NodoReference objeto3 = new NodoReference(55);
		//last era objeto anterio, mas nuevo objeto, por lo tanto last y last.next son iguales
		//
		last.next = objeto3;	
		//last = objeto2.objeto3
		//objeto2 -> objeto3
		
		// head = objeto.objeto2.objeto3
		// objeto -> objeto2 -> objeto3
				

*/
	
		
		NodoReference objeto = new NodoReference(10);
		head = objeto;
		last = objeto;		
		//head -> OBJETO
		//last -> OBJETO
		NodoReference objeto2 = new NodoReference(99);
		
		last.next = objeto2;
		//OBJETO.NEXT -> objeto2
		//head -> [OBJETO.NEXT -> objeto2]
		//last -> [OBJETO.NEXT -> objeto2]
		
		last = objeto2;
		//last -> objeto2
		
		
		NodoReference objeto3 = new NodoReference(88);	
		last.next = objeto3;
		//last -> [objeto2.NEXT = objeto3]
		//head -> [OBJETO.NEXT -> objeto2.NEX -> objeto3]		
		last =objeto3;

		
	}
	

}
