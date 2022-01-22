package com.hacker.rank;

public class TestRecursivo {
	
	static int global_variable;

	public static void main(String[] args) {
		 int[] arr = {1,8,2,6,6,2,3,5};
		System.out.println(list(arr));

	}
	
	
	public static int sequence(int [] arr, int n ) {
		
		int res = 1;
		
		int updatable = 1;
		
		if(n == 1) {
			return 1;
		}
		
		
		for(int i = 1; i < n; i ++ ) {
			
			res = sequence(arr,i);	
			
			//updatable = res + 1;
			
			//Daque que res, siempre sera menor al for interno
			if(res + 1 > updatable && arr[i-1] < arr[n-1])
				updatable = res + 1;
			
			//System.out.println("updatable:<" +i+">: "+ updatable);
			
		}
		// cada lazo produce un numero
		if(global_variable < updatable) {
			global_variable = updatable;
		}
		// devuelve el contador 
		return updatable;
		
	}
	
	public static int list(int[] arr) {
		global_variable = 1;
		sequence(arr,arr.length);
		return global_variable ;
	}

}
