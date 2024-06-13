package com.cisco.training.basics;

public class PrimitiveVsReference {

	public static void main(String[] args) {
		int i = 100;
		
		double d = 100.1;
		
		char c = 'a';
		
		
		HelloWorld hw = new HelloWorld();
		int[] iArray = new int[25];
		iArray[0] = 42;
		
		change(i);
		System.out.println(i);
		changeArray(iArray);
		System.out.println(iArray[0]);

	}
	
	public static void change(int x) {
		x++;
	}
	
	public static void changeArray(int[] nums) {
		nums[0]++;
	}

}
