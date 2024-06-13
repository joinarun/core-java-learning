package com.cisco.training.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

import com.cisco.training.basics.ChemicalElement;

public class MapDemo {

	public static void main(String[] args) {
		//mapOpsWithStringKey();
		mapOfUserDefinedTypeKey();
	}

	private static void mapOfUserDefinedTypeKey() {
		ChemicalElement h = new ChemicalElement(1, "Hydrogen", "H");
		ChemicalElement k = new ChemicalElement(19, "Potassium", "K");
		ChemicalElement o = new ChemicalElement(8, "Oxygen", "O");
		ChemicalElement ga = new ChemicalElement(31, "Gallium", "Ga");
		
		Map<ChemicalElement,Float> earthComposition = new HashMap<>();
		earthComposition.put(h, 21.1f);
		earthComposition.put(o, 30.2f);
		earthComposition.put(k, 4f);
		earthComposition.put(ga, 0.2f);
		
		Scanner kb = new Scanner(System.in);
		while(true) {
			System.out.println("Enter atomic num: ");
			String input = kb.nextLine();
			if(input.equalsIgnoreCase("quit")) {
				break;
			}
			
			ChemicalElement c = new ChemicalElement(Integer.parseInt(input), "umknow", "y");
			
			if(earthComposition.containsKey(c)) {
				System.out.println(input+" is "+earthComposition.get(c)+" % of earth");
			}else {
				System.out.println("No data for "+input);
			}
		}
		
		
	}

	private static void mapOpsWithStringKey() {
		Map<String,Integer> runsMap = new LinkedHashMap<>();
		
		runsMap.put("virat", 77);
		runsMap.put("rohit", 45);
		runsMap.put("ashwin", 87);
		runsMap.put("bumrah", 23);
		runsMap.put("virat", 78);
		
		Scanner kb = new Scanner(System.in);
		while(true) {
			System.out.println("Enter a batter name: ");
			String input = kb.nextLine();
			if(input.equalsIgnoreCase("quit")) {
				break;
			}
			
			if(runsMap.containsKey(input)) {
				int runs = runsMap.get(input);
				System.out.println(input+" ----------> "+runs);
			}else {
				System.out.println("No data for "+input);
			}
		}
		
		System.out.println("___________ Whole Map ___________");
		Collection<String> keys = runsMap.keySet();
		
		for(String aKey : keys) {
			System.out.println(aKey+" -------------> "+runsMap.get(aKey));
		}
	}

}
