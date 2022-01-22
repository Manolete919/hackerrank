package com.hacker.rank;

public class LongestSubsecuence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {5,8,3,9,1,5,7};
		//int[] arr = {5,6,8,3,9,10};

		int[] result = new int[arr.length];
		 System.out.println("RES "+getSubsecueceCount(arr,2,3,0));
		// result[i] = getSubsecueceCount(arr,1,1,0);
		/*for(int i = 1; i < arr.length; i++ ) {
			result[i] = getSubsecueceCount(arr,i-1,i,0);
			System.out.println("RESULTADO " + i + " " + result[i] );
		}*/
		
		//System.out.println("max final: " + getMax(arr,0));
	 
		

	}
	
	
	/*public static int getMax(int[] arr, int contador){
		
			
		if(contador == arr.length) {
			return contador;
		}
		

		
		//Si contador sopresa el tamaño de la lista no hay necesidad de buscar las demas
		if(contador < arr.length-2) {					
			int a = getSubsecueceCount(arr,contador+1,0);
			int b = getSubsecueceCount(arr,contador+2,0);
			System.out.println("a: " + a);
			System.out.println("b: " + b);
			contador = Math.max(getMax(arr,a),getMax(arr,b));

			
		}
		return contador;
		
				
	}*/
	
	
	
	public static int getSubsecueceCount(int[] arr, int lastPosition, int nextPosition, int contador) {
		//int subsecuenceCount = 0;
		//System.out.println("contador: " + contador);
		
		if(nextPosition == arr.length) {
			return contador +1;
		}
		 
		//comparo el ultimo de la secuencia, si permite continuar
		if(arr[lastPosition] <= arr[nextPosition]  ) {						
			System.out.println("--true: " + arr[lastPosition] + " < " + arr[nextPosition] );
			contador++; 
			//si hay mas elementos en la lista, llamar recursivamnete
			if(nextPosition < arr.length  ) {
				
				
				lastPosition = nextPosition;
				nextPosition ++;
				//aumenta el contador,
				contador = getSubsecueceCount(arr,lastPosition,nextPosition,contador);
			}
		}else {

			
			System.out.println("--FALSE: " + arr[lastPosition ] + " < " + arr[nextPosition] );
			 

			
			if(nextPosition < arr.length ) {
			
				nextPosition++;
				contador = getSubsecueceCount(arr,lastPosition,nextPosition,contador);				
				
			}			
			
		}
		

		
		
		
		return contador;		
	}
	
	

}
