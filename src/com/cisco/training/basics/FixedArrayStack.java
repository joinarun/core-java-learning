package com.cisco.training.basics;

public class FixedArrayStack implements Stack{
	
	private Object[] contents;
	private int top = -1;
	
	public FixedArrayStack(int capacity) {
		contents = new Object[capacity];
	}
	
	@Override
	public void push(Object anElement) {
		if(top == contents.length - 1) {
			throw new StackFullException("Oops! The stack is full with "+contents.length+" elements.");
		}
		contents[++top] = anElement;
	}

	@Override
	public Object pop() {
		if(top == -1) {
			throw new StackEmptyException("The stack is empty!");
		}
		return contents[top--];
	}
}
