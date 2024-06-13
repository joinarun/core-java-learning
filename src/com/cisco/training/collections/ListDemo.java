package com.cisco.training.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.cisco.training.basics.ChemicalElement;

public class ListDemo {
	
	public static void myAlgo(List<String> list) {
		
		//logic
		list.add(0, "abc");
		
		//logic
		list.add(0, "xyz");
		
		//logic
		
		list.remove(0);
		
		//logic loop
		String s = list.get(1);
		
//		for(int i = 0 ; i < list.size() ; i++) {
//			String aString = list.get(i);
//			//do whatever with aString
//			System.out.println(aString);
//		}
		
		
		//Classical iterator loop
//		Iterator<String> it = list.iterator();
//		System.out.println(it.getClass().getName());
//		
//		while(it.hasNext()) {
//			String aString = it.next();
//			//do whatever
//			System.out.println(aString);
//		}
		
		//Enhanced for loop
		
		for(String aString : list) {
			//whatever
			
			System.out.println(aString);
		}
		
	}

	public static void main(String[] args) {
		//listOpsWithRawList();
		//listOpsWithGenericList();
		
		List<String> sList = new LinkedList<>();
		sList.add("aaa");
		myAlgo(sList);
	}

	private static void listOpsWithGenericList() {
		List<String> sList = new ArrayList<String>();
		List<Integer> iList = new ArrayList<>();
		
		sList.add("akak");
		//sList.add(123);
		iList.add(1233);
		//iList.add("aa");
		String s = sList.get(0);
		Integer i = iList.get(0);
	}

	private static void listOpsWithRawList() {
		
		ArrayList l = new ArrayList();
		
		l.add("abc");
		l.add("xyz");
		l.add(123);
		l.add(2);
		l.add(1, new ChemicalElement(1, "Hy", "H"));
		
		
		String first = (String) l.get(0);
		ChemicalElement ele = (ChemicalElement) l.get(1);
		
		System.out.println(l);
		Integer iObj = 2;
		l.remove(iObj);
		System.out.println(l);
		
	}

}
