package com.cisco.training.basics;

public class Engineer extends Employee {
	String skills;
	public Engineer(int id,String name,float salary, String skillset) {
		super(id, name, salary);
		skills = skillset;
	}

}
