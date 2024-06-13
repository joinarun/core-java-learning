package com.cisco.training.lambdas;

import java.util.Arrays;

public class LambdaDemo {
	
	public static String betterString(String entry1,String entry2,TwoStringPredicate decider) {
		if(decider.isFirstBetterThanSecond(entry1, entry2)) {
			return entry1;
		}else {
			return entry2;
		}
	}
	
	public static <T> T betterEntry(T entry1,T entry2,TwoElementPredicate<T> decider) {
		if(decider.isFirstBetterThanSecond(entry1, entry2)) {
			return entry1;
		}else {
			return entry2;
		}
	}
	

	private static void useCustomFunctionalInterface() {
//		String longer = betterString("hi", "hello", (s1,s2) -> s1.length() > s2.length() );
		String longer = betterEntry("hi", "hello", (s1,s2) -> s1.length() > s2.length() );
		
		System.out.println("Longer is "+longer);
		
		Integer smaller = betterEntry(10, 42, (i1,i2) -> i1 < i2);
		System.out.println(smaller);
	}
	
	
	public static void main(String[] args) {
		//sortExercises();
		useCustomFunctionalInterface();
	}



	//arity            rt                   args
//si acc	mod    rt      name 		args
	public  static int wordsWithEFirst(String s1,String s2) {
		if(s1.contains("e") && !s2.contains("e")) {
			return -1;
		}else if(!s1.contains("e") && s2.contains("e")) {
			return 1;
		}else {
			return 0;
		}
	}
	
	private static void sortExercises() {
		String[] words = { "this", "is", "if", "a", "bunch", "of", "strange", "zebra", "words", "like", "xylophone", "and" };
		
		//Arrays.sort(words, (s1,s2) -> s1.length() - s2.length() );
		//Arrays.sort(words, (s1,s2) -> s2.length() - s1.length() );
		//Arrays.sort(words, (s1,s2) -> s1.charAt(0) - s2.charAt(0) );
		
		
		
		//Arrays.sort(words, (s1,s2) -> wordsWithEFirst(s1, s2));
		//LambdaDemo obj = new LambdaDemo();
		Arrays.sort(words, LambdaDemo::wordsWithEFirst);
		
		System.out.println(Arrays.asList(words));
	}

}
