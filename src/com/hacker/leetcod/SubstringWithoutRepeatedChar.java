package com.hacker.leetcod;

public class SubstringWithoutRepeatedChar {

	public static void main(String[] args) {

		//String s = "abcfghamnopqrstu";
		//String s = "bbbbbbbbbbbbc";
		//String s = "pwwkew";
		String s = "abcexbmz";
		
		int size = 0;
		int theLongest = 1;
		String finalSubstring = s.charAt(0)+"";
		
		while(size < s.length()-1) {
			//System.out.println("contador: " + size );
			String substring = getSubstring(size,size+1,s);
			//System.out.println("final substring " + substring );
			if(substring.length() > theLongest ) {
				theLongest = substring.length();
				finalSubstring = substring;
			}
			size ++;	
			//size += substring.length();
			
		
		}
		//String substring = getSubstring(0,2,s);
		
		//String substring = getSubstring(0,1,s);
		//System.out.println("final substring " + substring );
		System.out.println("final substring " + finalSubstring );
		
		
		
		
		
		
		

	}

	private static String getSubstring(int fromIndex,int indexChar, String s) {
		
 
		
		int beginOfTheString = fromIndex;
		boolean isEqual = false;
		
		int len = indexChar - fromIndex ;
				
		
		if(indexChar == s.length() ) {
			return s.substring(fromIndex,fromIndex+len);
		}
		//System.out.println("len " + len);

		//System.out.println("fromIndex:  " + fromIndex + " indexChar: " + indexChar);
		//System.out.println("beginOfTheString:  " + beginOfTheString + " (beginOfTheString + len): " + (beginOfTheString + len));

		int max = (beginOfTheString + len);
		//System.out.println("MAX " +max);
		//System.out.println("ANTES DE ENTRAR --beginOfTheString:  " + beginOfTheString + " indexChar: " + indexChar);

		while(!isEqual && beginOfTheString < max ) {	

			//System.out.println("--beginOfTheString:  " + beginOfTheString + " indexChar: " + indexChar);

			//System.out.println(s.charAt(beginOfTheString) + " != " + s.charAt(indexChar));

			if(s.charAt(beginOfTheString) != s.charAt(indexChar)) {
				beginOfTheString ++;
				//System.out.println("false ");
				isEqual = false;
			}else {
				//System.out.println("true ");
				isEqual = true;
				break;
			}
		}
		
		//System.out.println(" ULTIMO --beginOfTheString:  " + beginOfTheString + " indexChar: " + indexChar);

		
		if(isEqual) {
			// no entra, devolvemos la cadena previa a ese caracter
			//System.out.println("len " + len + " s " + s + " fromIndex " + fromIndex);

			return  s.substring(fromIndex,fromIndex+len);
		}else {
			//System.out.println(" -- RECUR - indexChar " + indexChar+1 + " s " + s + " fromIndex " + fromIndex);
			return getSubstring(fromIndex,indexChar+1, s);
		}
		
		//return "";
				
		
		
	}
	

	
	

}
