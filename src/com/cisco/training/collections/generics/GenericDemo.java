package com.cisco.training.collections.generics;

import java.util.List;

public class GenericDemo {

	public static <T> List<T> convertToList(T[] someArray) {
		
		//elided
		return null;
	}
	
	
	
	public static void main(String[] args) {
		//genericStack();

		String[] words = {"jj","kk"};
		Integer[] nums = {12,24};
		
		List<String> sList = convertToList(words); 
		List<Integer> iList = convertToList(nums);
		
		//sList = convertToList(nums);
	}

	private static void genericStack() {
		Stack<String> s = new FixedArrayStack<>(10);
		
		s.push("abc");
		s.push("xyz");
		
		String str = s.pop();
		
		//s.push(12);
		
		//Integer i = (Integer) s.pop();
		
	}

}
