package com.cisco.training.basics.java8intf;

public interface Stack {
	
	
	
	void push(Object anElement);
	Object pop();

	default int size() {
		//return -1;
		throw new UnsupportedOperationException();
	}
}
