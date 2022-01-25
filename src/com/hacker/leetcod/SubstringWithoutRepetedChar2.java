package com.hacker.leetcod;

import java.util.HashSet;

public class SubstringWithoutRepetedChar2 {
	
	public static int  lengthOfTheLongestSubstring(String s) {
		int index_to_delete = 0;
		int pointer_b = 0;
		int max = 0;
		
		HashSet<Character> windows = new HashSet();
		while (pointer_b < s.length() ) {
			System.out.println("VALUE TO COMPARE " + s.charAt(pointer_b));
			if(!windows.contains(s.charAt(pointer_b))) {
				System.out.println("SE AGREGA " + s.charAt(pointer_b));
				windows.add(s.charAt(pointer_b));
				max = Math.max(windows.size(), max);		
				pointer_b ++;
			}else {
				// elimina el encontrado de la lista
				//System.out.println("size after " + windows.size());
				
				System.out.println("REMOVE " + s.charAt(index_to_delete) );
				
				windows.remove(s.charAt(index_to_delete));				
				index_to_delete ++;
				
				//System.out.println("size before " + windows.size());
				//windows.clear();
				//pointer_a = pointer_b;
			}
		}
		return max;		
	}

	public static void main(String[] args) {
		//System.out.println(lengthOfTheLongestSubstring("abcexcdefghijk"));
		//System.out.println(lengthOfTheLongestSubstring("abcexb"));
		System.out.println(lengthOfTheLongestSubstring("abcexbmz"));


	}

}
