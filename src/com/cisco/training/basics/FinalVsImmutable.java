package com.cisco.training.basics;

public class FinalVsImmutable {

	public static void main(String[] args) {
		//Chemical Element obj is immutable
		ChemicalElement h = new ChemicalElement(1, "Hydrogen", "H");
		//h.atomicNumber = 12;
		//h.setSymbol("He");
		//the below line is ok for immutable obj
		h = new ChemicalElement(19, "Pot", "K");
		
		//Mutable object example
		Employee e = new Employee(1, "abc", 1234);
		e.salary = e.salary + 10;
		
		e = new Employee(0, null, 0);
		
		//final example
		final Employee e2 = new Employee(2, "xyx", 12345);
		
		e2.salary = e2.salary - 10;
		
		//e2 = new Employee(0, null, 0);
		
	}

}
