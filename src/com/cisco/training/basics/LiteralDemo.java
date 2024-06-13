package com.cisco.training.basics;

public class LiteralDemo {

	public static void main(String[] args) {
		int i = 100;
		long l = 100;
		double d = 100;
		float f = 100;
		
		char c = 'a';
		char uc ='\u8c05';
		
		m1(100);
		m1(100.0);
		m1(100D);
		m1(100L);
		m1(100f);
		m1(100.0f);
		
		String s = "This is str literal";
		
		int octal = 0233;
		int hex = 0x233;
		System.out.println(hex);
		
		int i3 = (int) l;
		
	}
	
	public static void m1(int x) {
		//logic
	}

	public static void m1(long x) {
		//logic
	}
	
	public static void m1(double x) {
		//logic
	}
	
	public static void m1(float x) {
		//logic
	}
}
