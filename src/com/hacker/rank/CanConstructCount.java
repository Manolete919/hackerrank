package com.hacker.rank;

public class CanConstructCount {

	public static void main(String[] args) {
		System.out.println(canConstruct("abcdef", new String[] {"ab","abc","cd","def", "abcd"}));
		
		
	}

	private static boolean canConstruct(String target, String[] strings) {
		
		boolean[] dt = new boolean[target.length()+1];
		dt[0]=true;
		// character by character
		for(int i = 0; i <= target.length(); i++) {
			if(dt[i]) {
				for(String word : strings) {
					if(i+word.length() <= target.length())
						// if the word matches the caracter starting at position i
						// si corto en el indice i + el length de la palabra esta deberia ser igual
						if(target.substring(i,i+word.length()).equals(word)) {
							dt[i+word.length()] = true;
						}
				}			
			}
		}
		
        for(int i= 0; i < dt.length; i++) {
            System.out.println("INDICE " + i + " -> "+ dt[i]);
        }
		return dt[target.length()];
		
		
	}
	
	 

}
