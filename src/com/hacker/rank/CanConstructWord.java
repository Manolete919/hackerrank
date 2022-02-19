package com.hacker.rank;

public class CanConstructWord {

	public static void main(String[] args) {
		System.out.println(canConstruct("purple", new String[] {"purp","p","ur","le", "purpl"}));
		
		
	}

	private static int canConstruct(String target, String[] strings) {
		
		int[] dt = new int[target.length()+1];
		dt[0]=1;
		// character by character
		for(int i = 0; i <= target.length(); i++) {
			if(dt[i] != 0) {
				for(String word : strings) {
					if(i+word.length() <= target.length())
						// if the word matches the caracter starting at position i
						// si corto en el indice i + el length de la palabra esta deberia ser igual
						if(target.substring(i,i+word.length()).equals(word)) {
							dt[i+word.length()] += dt[i];
						}
				}			
			}
		}
		
        for(int i= 0; i < dt.length; i++) {
            System.out.println("INDICE " + (" "+target).charAt(i) + " -> "+ dt[i]);
        }
		return dt[target.length()];
		
		
	}
	
	 

}
