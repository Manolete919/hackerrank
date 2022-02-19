package com.hacker.rank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllConstructWord {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("hola");
		list.add("mundo");
		//System.out.println("ultima " + list.get(list.size()-1));
		
		//System.out.println(canConstruct("purple", new String[] { "purp", "p", "ur", "le", "purpl" }));
		System.out.println(canConstruct("abcdef", new String[] { "ab", "abc", "cd", "def","abcd","ef", "c" }));


	}

	private static List<List<String>> canConstruct(String target, String[] strings) {

		List<List<String>>[] dt = (List<List<String>>[]) new ArrayList[target.length() + 1];

		List<List<String>> res = new ArrayList<List<String>>();
		res.add(new ArrayList<>());

		dt[0] = res;
		// character by character
		for (int i = 0; i <= target.length(); i++) {
			if (dt[i] != null) {
				for (String word : strings) {
					if (i + word.length() <= target.length())
						// if the word matches the caracter starting at position i
						// si corto en el indice i + el length de la palabra esta deberia ser igual
						if (target.substring(i, i + word.length()).equals(word)) {							
							List<List<String>> actualPosition = new ArrayList<List<String>>();
							// current position
							for(List<String> list : dt[i]) {
								ArrayList<String> tmp = new ArrayList<String>(list);
								tmp.add(word);
								actualPosition.add(tmp);
							} 							
							// future position
							if (dt[i + word.length()] == null) {
								dt[i + word.length()] = actualPosition;
							} else {
								dt[i + word.length()].addAll(actualPosition);
							}															
						}

				}
			}
		}

		for (int i = 0; i < dt.length; i++) {
			System.out.println("INDICE " + (" " + target).charAt(i) + " -> " + dt[i]);
		}
		return dt[target.length()];

	}

}
