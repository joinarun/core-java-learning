package com.cisco.training.strings;

import com.cisco.training.basics.Employee;

public class StringDemo {

	public static void main(String[] args) {
		
		String s1 = "hello";
		String s =  "aa"+10; // "aa".concat(String.vauleOf(10))
		System.out.println(s);
		Employee e = new Employee(1, "name1", 1234);
		s = s1 + e; //s1.concat(e.toString())
		System.out.println(s);
		
		String s2 = "hello";
		
		String s3 = new String("hello");
		
		System.out.println("s1 == s2 ? "+(s1==s2));
		System.out.println("s1 == s3 ? "+(s1==s3));
		System.out.println("s1.equals(s3) ? "+(s1.equals(s3)));
		
		String s4 = s1.concat(" world!");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s4);
		
		//------------------------------ DONT DO THIS
		String[] words = {"this","is","bunch","of","words"};
		String sentence = "";
//		for(int i = 0 ; i < words.length ; i++) {
//			sentence = sentence.concat(words[i]);
//			//System.out.println(sentence);
//		}
		
		StringBuilder buf = new StringBuilder();
		
		for(int i = 0 ; i < words.length ; i++) {
			buf.append(words[i]);
			buf.append(" ");
		}
		sentence = buf.toString();
		System.out.println(sentence);
	}

}
