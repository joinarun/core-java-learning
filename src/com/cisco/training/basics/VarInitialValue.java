package com.cisco.training.basics;

public class VarInitialValue {

	int instanceI;
	static int classLevelI;
	static boolean isItTrue;
	static String something;

	public static void main(String[] args) {

		int localI;
		boolean localBool;

		localI = ++classLevelI;

		System.out.println(new VarInitialValue().instanceI);
		System.out.println(classLevelI);
		System.out.println(localI);
		System.out.println(isItTrue);
		System.out.println(something);

//		System.out.println(localBool);
	}

}
