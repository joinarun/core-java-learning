package com.cisco.training.basics;

public class StackApp {

	public static void main(String[] args) {
		StackUser u = new StackUser();

		FixedArrayStack fas = new FixedArrayStack(9);
		
		//DynStack fas = new DynStack();
		u.fill(fas); //type sub
	}

}
