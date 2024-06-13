package com.cisco.training.collections.generics;

import java.util.List;

public class WildCardDemo {
	
	public static double sum(List<? extends Number> numList) {
		
		//numList.add(233d);
		double sum = 0;
		for(Number aNum : numList) {
			sum += aNum.doubleValue();
		}
		return sum;
	}

	public static void main(String[] args) {
		List<Integer> inums = List.of(14, 17, 37, 42); 
		//List<Float> fnums = List.of(14f, 17f, 37f, 42f); 
		
		//inums.add(233d);
		
		//double sum = sum(fnums);
		
		//System.out.println(sum);
		
		double sum = sum(inums);
		
		System.out.println(sum);
		
		//Number n = new Integer(12);
	}

}
