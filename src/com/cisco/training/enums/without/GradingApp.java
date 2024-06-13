package com.cisco.training.enums.without;

public class GradingApp {

	public static void main(String[] args) {
		Student s = new Student();
		s.setId(1);
		s.setName("some");
		//s.setGrade('a');
		s.setGrade(IGrade.GRADE_A);
		
		

		s.setGrade('z');
	}

}
