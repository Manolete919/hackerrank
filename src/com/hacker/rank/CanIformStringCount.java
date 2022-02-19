package com.hacker.rank;

public class CanIformStringCount {
	
	static int  global = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(canIformAString("holamundocr",new String[] {"ho","la","cr","mundo"}));
		//System.out.println(solve2("purple",new String[] {"purp","p","ur","le","purpl"}));
		System.out.println(countConstruct("enterapotentpot",new String[] {"a","p","ent","enter","ot","o","t"}));

	}

	private static int canIformAString(String string, String[] strings) {
		global = 0;
		solve(string,strings);
		return global;
		
	}

	private static boolean solve(String word, String[] strings) {
		
		
		
		if("".equals(word)) {
			global ++;
			//System.out.println("termina");
			return true;
		}
		
		
		for(String syllable: strings) {
			
			
			String lastWord = word;
			if(word.length() > syllable.length() ) {
				lastWord = word.substring(word.length() - syllable.length());
			}
								
			if(lastWord.equals(syllable)) {
				//System.out.println("IGUAL " + lastWord);
				String newWord = word.substring(0,word.length() - syllable.length());
				//System.out.println("REMAIING " + newWord);
				solve(newWord,strings);							
			}
			
		}
		
		return false;
	}
	
	
	private static int solve2(String word, String[] strings) {
		
		
		
		if("".equals(word)) {
			return 1;
		}
		
		int contador = 0;
		for(String syllable: strings) {
						
			String lastWord = word;
			if(word.length() > syllable.length() ) {
				lastWord = word.substring(word.length() - syllable.length());
			}
								
			if(lastWord.equals(syllable)) {
				String newWord = word.substring(0,word.length() - syllable.length());
				contador += solve2(newWord,strings);							
			}
			
		}
		
		return contador;
	}
	
	public static int countConstruct(String target, String[] wordBank) {
		if("".equals(target)) {
			return 1;
		}
		int total = 0;
		for(String word : wordBank) {
			//it gives me the begining of a substring.
			// 0 means it begins at position 0
			// si la contiene y está al inicio
			if(target.indexOf(word) == 0){
				int numWays = countConstruct(target.substring(word.length()),wordBank);
				total += numWays;
			}
		}
		
		return total;
	}

}
