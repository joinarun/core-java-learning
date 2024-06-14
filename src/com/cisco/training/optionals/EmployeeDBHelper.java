package com.cisco.training.optionals;

import java.util.Optional;

import com.cisco.training.basics.Employee;

public class EmployeeDBHelper {
	
	public static Optional<Employee> findFromDB(int id) {
		//select * from emptable where emp_id=? 
		boolean found = false;
		if(found) {
			return Optional.of(new Employee(id, "namefromdb", 1223f));
		}else {
			return Optional.empty();
		}
	}

}
