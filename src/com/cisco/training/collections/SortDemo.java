package com.cisco.training.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.cisco.training.basics.ChemicalElement;

public class SortDemo {

	public static void main(String[] args) {
		// sortStringArray();
		// sortUserDefinedArray();
		// sortListOfStrings();
		// sortStringArrayOnLength();
		sortStringArrayOnLengthUsingAnon();
	}

	private static void sortStringArrayOnLengthUsingAnon() {
		String[] words = { "this", "is", "a", "bunch", "of", "strange", "zebra", "words", "like", "xylophone", "and" };

		System.out.println("before sort\n" + Arrays.asList(words));
		
		Arrays.sort(words,new Comparator<String>() {
			public int compare(String s1,String s2) {
				return s1.length() - s2.length();
			}
		});

		System.out.println("after sort\n" + Arrays.asList(words));

	}
	
	private static void sortStringArrayOnLength() {
		String[] words = { "this", "is", "a", "bunch", "of", "strange", "zebra", "words", "like", "xylophone", "and" };

		System.out.println("before sort\n" + Arrays.asList(words));

		Arrays.sort(words,new StringLengthComparator());

		System.out.println("after sort\n" + Arrays.asList(words));

	}

	private static void sortListOfStrings() {
		String[] words = { "this", "is", "a", "bunch", "of", "strange", "zebra", "words", "like", "xylophone", "and" };
		List<String> wordList = Arrays.asList(words);

		System.out.println("b4 sort\n" + wordList);

		Collections.sort(wordList);

		System.out.println("after sort\n" + wordList);
	}

	private static void sortUserDefinedArray() {
		ChemicalElement h = new ChemicalElement(1, "Hydrogen", "H");
		ChemicalElement k = new ChemicalElement(19, "Potassium", "K");
		ChemicalElement o = new ChemicalElement(8, "Oxygen", "O");
		ChemicalElement ga = new ChemicalElement(31, "Gallium", "Ga");

		ChemicalElement[] chemArray = new ChemicalElement[] { h, k, o, ga };

		System.out.println("before sort\n" + Arrays.asList(chemArray));

		Arrays.sort(chemArray);

		System.out.println("after sort\n" + Arrays.asList(chemArray));

	}

	private static void sortStringArray() {
		String[] words = { "this", "is", "a", "bunch", "of", "strange", "zebra", "words", "like", "xylophone", "and" };

		System.out.println("before sort\n" + Arrays.asList(words));

		Arrays.sort(words);

		System.out.println("after sort\n" + Arrays.asList(words));

	}

}
