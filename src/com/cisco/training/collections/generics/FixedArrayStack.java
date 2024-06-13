package com.cisco.training.collections.generics;

public class FixedArrayStack<E> implements Stack<E>{
	
	private Object[] contents;
	private int top = -1;
	
	public FixedArrayStack(int capacity) {
		contents = new Object[capacity];
	}
	
	@Override
	public void push(E anElement) {
		if(top == contents.length - 1) {
			throw new StackFullException("Oops! The stack is full with "+contents.length+" elements.");
		}
		contents[++top] = anElement;
	}

	@Override
	public E pop() {
		if(top == -1) {
			throw new StackEmptyException("The stack is empty!");
		}
		return (E) contents[top--];
	}
}
