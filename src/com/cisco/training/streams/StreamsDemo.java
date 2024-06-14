package com.cisco.training.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("this", "is", "if", "a", "bunch", "of", "strange", "zebra", "words", "like", "xylophone", "and" );
		
//		words
//			.stream()
//			.forEach(s -> System.out.println("  "+s));
		
//		words
//		.stream()
//		.forEach(System.out::println);
		
		List<String> excitingWords = words
										.stream()
										.map(s -> s.toUpperCase())
										.map(s -> s + "!")
										.toList();
		System.out.println(excitingWords);
		
		List<String> wordsWithB = words
									.stream()
									.filter(s -> s.contains("b"))
									.map(s -> s + "!")
									.collect(Collectors.toList());
		System.out.println(wordsWithB);
		
		words
		.stream()
		.filter(s->s.length()>3)
		.map(s->s.length())
		.map(i -> i * i)
		.map(Math::sin)
		.forEach(System.out::println);
		
		String sentence = words
							.stream()
							.reduce((s1,s2) -> s1+" "+s2)
							.orElse("no data");
		
		System.out.println(sentence);
	}

}
