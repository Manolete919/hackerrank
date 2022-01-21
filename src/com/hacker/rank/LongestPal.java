package com.hacker.rank;

public class LongestPal {

	public static void main(String[] args) {
		
		System.out.println(longEstPal("racecar"));
		//System.out.println(longEstPal("forgeeksskeegfor"));
		

	}
	
	public static String longEstPal(String s) {
		if(s == null || s.length() < 1) {
			return "";
		}
		int len = 0, len1 = 0, len2 = 0;
		int start = 0; int end = 0;
		for(int i = 0; i < s.length(); i++) {
			System.out.println("i " + i);
			len1 = expandFromMiddle(s, i, i);
			len2 = expandFromMiddle(s, i, i+1);
			
			//System.out.println("-len1 " + len1);
			//System.out.println("-len2 " + len2);
			len = Math.max(len1, len2);
			//System.out.println("end-start: " + end + " "+ start);
			System.out.println("-len " + len);
			if(len > end - start) {
				//System.out.println("entroo");
				start = i - ((len -1)/2);
				end = i + (len/2);
				System.out.println("start: " + start + " end: "+ end);
			}
			
		}
		
		return s.substring(start,end+1);
		
		
	}
	
	public static int expandFromMiddle(String s, int left, int right) {
		if(s== null || left > right) {
			return 0;
		}
		//System.out.println(" left " + left + " right " + right );
		while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right) ) {
			//System.out.println(" palindrome " + s.charAt(left) + " "+ left + " right " + right + " " + s.charAt(right));
			left --;
			right ++;
			//System.out.println(" ------left " + left + " right " + right );
			//System.out.println("DEBE CONTINUAR: " + (left >= 0 && right < s.length()));
			//if(left >= 0 && right < s.length())
				//System.out.println("----"+s.charAt(left)+ " == " + s.charAt(right));
		}
		
		//System.out.println("left" +left );
		///System.out.println("right" +right );
		
		//int retur = ( right - left) + 1;

		//System.out.println( "return " + retur );
		
		
		return  ((right - left) -1);
		
	}

}
