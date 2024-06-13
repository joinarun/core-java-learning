package com.cisco.training.lambdas;

@FunctionalInterface
public interface TwoElementPredicate<E> {

	public boolean isFirstBetterThanSecond(E first,E second);
}
