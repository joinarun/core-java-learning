package com.cisco.training.basics;

public class ChemicalApp {

	public static void main(String[] args) {
		ChemicalElement h = new ChemicalElement(1, "Hydrogen", "H");
		ChemicalElement k = new ChemicalElement(19, "Potassium", "K");
		ChemicalElement o = new ChemicalElement(8, "Oxygen", "O");
		ChemicalElement ga = new ChemicalElement(31, "Gallium", "Ga");
		
		displayDetails(h);
		displayDetails(k);
		displayDetails(o);
		displayDetails(ga);
	}

	private static void displayDetails(ChemicalElement c) {
		
//		System.out.println("___________ Details of "+c.name+"____________");
//		System.out.println("Is it a Metal? "+c.isMetal());
//		System.out.println("Is it an Alkali Metal? "+c.isAlkaliMetal());
//		System.out.println("Is it a Transition Metal? "+c.isTransitionMetal());
//		System.out.println("___________________________________________________");
		
		
		
		String val = """
				__________________ Details of %s _____________________
				Is it a Metal? %s
				Is it a Alkali Metal? %s
				Is it a Transition Metal? %s
				________________________________________________________
				""".formatted(c.getName(),c.isMetal(),c.isAlkaliMetal(),c.isTransitionMetal());
		System.out.println(val);
	}

}
