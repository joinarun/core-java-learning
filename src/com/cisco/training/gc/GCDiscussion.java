package com.cisco.training.gc;

import com.cisco.training.basics.Car;
import com.cisco.training.basics.Employee;

public class GCDiscussion {

	public static void main(String[] args) {
		
		int localToMain = 42;
		m1();
		//Point Z
	}

	private static void m1() {
		float f = 23f;
		Employee e = new Employee(0, null, f);
		m2(e);
		//Point Y
	}

	private static void m2(Employee x) {
		boolean fine = true;
		
		Car c = new Car();
		
		//Point X
		
	}

}
