package com.hacker.rank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CanConstructArrays {
	
	static int  global = 0;

	public static void main(String[] args) {
		System.out.println(solve("enterapotentpot",new String[] {"a","p","ent","enter","ot","o","t"}));
		System.out.println(solve("purple",new String[] {"purp","p","ur","le","purpl"}));
		

	}


	private static List<List<String>> solve(String string, String[] strings) {
		Map<String, List<List<String>>> memo = new HashMap<String, List<List<String>>>() ;
		// TODO Auto-generated method stub
		return countConstruct(string,strings,memo );
	}


	public static List<List<String>> countConstruct(String target, String[] wordBank, Map<String,List<List<String>>> memo) {
		if(memo.containsKey(target)) {
			return memo.get(target);
		}
 		
		if("".equals(target)) {
			return  Arrays.asList(new ArrayList<String>());
		}
		
		
		List<List<String>> total = new ArrayList<List<String>>();
		for(String word : wordBank) {
			//System.out.println(memo);

			//it gives me the begining of a substring.
			// 0 means it begins at position 0
			// si la contiene y está al inicio
			if(target.indexOf(word) == 0){
				String suffix = target.substring(word.length());
				List<List<String>> childNodes = countConstruct(suffix,wordBank,memo);	
				for (List<String> list : childNodes) {
					 // add to the first element
					list.add(0,word);
					total.add(list);
					
				}
							
			}
		}
		
		List<List<String>> newList = new ArrayList<List<String>>();
 		for(List<String> x : total) {
 			newList.add(new ArrayList<>(x));
 		}
		 
		memo.put(target,newList);
		return total;
	}

}
