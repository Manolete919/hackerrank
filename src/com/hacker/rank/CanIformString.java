package com.hacker.rank;

public class CanIformString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(canIformAString("holamundocr",new String[] {"ho","la","cr","mundo"}));

	}

	private static boolean canIformAString(String string, String[] strings) {
		
		boolean x = solve(string,strings);
		return x;
		
	}

	private static boolean solve(String word, String[] strings) {
		System.out.println("WORD: " + word);
		
		if("".equals(word)) {
			System.out.println("termina");
			return true;
		}
		
		
		for(String syllable: strings) {
			
			String lastWord = word;
			if(word.length() > syllable.length() ) {
				lastWord = word.substring(word.length() - syllable.length());
			}
						
			if(lastWord.equals(syllable)) {
				System.out.println("IGUAL " + lastWord);
				String newWord = word.substring(0,word.length() - syllable.length());
				System.out.println("REMAIING " + newWord);
				if(solve(newWord,strings)) {
					return true;
				}
			}
			
		}
		
		return false;
	}

}
