package com.cisco.training.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class BuiltinInterfaces {
	
//	public static List<String> allMatches(List<String> input,Predicate<String> condition){
//		List<String> output = new ArrayList<>();
//		for(String aValue : input) {
//			if(condition.test(aValue)) {
//				output.add(aValue);
//			}
//		}
//		return output;
//	}

	public static <T> List<T> allMatches(List<T> input,Predicate<T> condition){
		List<T> output = new ArrayList<>();
		for(T aValue : input) {
			if(condition.test(aValue)) {
				output.add(aValue);
			}
		}
		return output;
	}
	
//	public static List<String> transformedList(List<String> input,Function<String, String> transformationLogic){
//		List<String> output = new ArrayList<>();
//		for(String aValue : input) {
//			String transformedValue = transformationLogic.apply(aValue);
//			output.add(transformedValue);
//		}
//		return output;
//	}
	
	public static <T,R> List<R> transformedList(List<T> input,Function<T, R> transformationLogic){
		List<R> output = new ArrayList<>();
		for(T aValue : input) {
			R transformedValue = transformationLogic.apply(aValue);
			output.add(transformedValue);
		}
		return output;
	}
	
	public static void main(String[] args) {
		String[] words = { "this", "is", "if", "a", "bunch", "of", "strange", "zebra", "words", "like", "xylophone", "and" };
		List<String> wordList = Arrays.asList(words);
		
		List<String> shortWords = allMatches(wordList, s -> s.length() < 4);
		System.out.println(shortWords);
		List<String> wordsWithB = allMatches(wordList, s -> s.contains("b"));
		System.out.println(wordsWithB);
		List<String> evenLengthWords = allMatches(wordList, s -> (s.length() % 2) == 0);
		System.out.println(evenLengthWords);
		
		List<Integer> nums = Arrays.asList(1, 10, 100, 1000, 10000);
		List<Integer> bigNums = allMatches(nums, n -> n>500);
		
		System.out.println(bigNums);
		
		System.out.println("__________________");
		
		List<String> excitingWords = transformedList(wordList, s -> s + "!");
		System.out.println(excitingWords);
		List<String> eyeWords = transformedList(wordList, s -> s.replace("i", "eye"));
		System.out.println(eyeWords);
		List<String> upperCaseWords = transformedList(wordList, s -> s.toUpperCase());
		System.out.println(upperCaseWords);
		
		List<Integer> lengths = transformedList(wordList, s -> s.length());
		System.out.println(lengths);

	}

}
