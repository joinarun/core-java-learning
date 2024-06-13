package com.cisco.training.basics;

import java.io.FileWriter;
import java.io.IOException;

public class StackUser {
	
	public void fill(Stack s) {
		for(int i = 0 ; i < 10 ; i++) {
			try {
				s.push(i);
				System.out.println("Pushed -----------> "+i);
			} catch (StackFullException e) {
				
				try {
					
					FileWriter out = new FileWriter("abc.txt");
				
				} catch (IOException e1) {
					
					e1.printStackTrace();
				}
				
			}
		}
	}

}
