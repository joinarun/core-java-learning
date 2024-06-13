package com.cisco.training.lambdas;

@FunctionalInterface
public interface TwoStringPredicate {

	boolean isFirstBetterThanSecond(String first,String second);
	
	
}
