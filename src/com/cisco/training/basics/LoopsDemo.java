package com.cisco.training.basics;

public class LoopsDemo {

	public static void main(String[] args) {
		loop1:for (int i = 0; i < 10; i++) {
			
			System.out.println("In for loop i = "+i);
			
			int j = 10;
			while(j <= 10) {
				System.out.println("i = "+i+" , j = "+j);
				if(i == j) {
					break loop1;
				}
				--j;
			}
			
			System.out.println("In for loop but after while.....");
		}

		
		System.out.println("After for loop");
	}

}
