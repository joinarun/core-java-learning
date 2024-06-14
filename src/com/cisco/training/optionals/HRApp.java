package com.cisco.training.optionals;

import java.util.Optional;

import com.cisco.training.basics.Employee;

public class HRApp {

	public static void main(String[] args) {
		
		int id = 23;//from ui
//		Optional<Employee> opt = EmployeeDBHelper.findFromDB(id);
//		
//		if(opt.isPresent()) {
//		Employee e = opt.get();
//		System.out.println("""
//				Employee id: %s
//				Employee name: %s
//				Employee Sal: %s
//				""".formatted(e.getId(),e.getName(),e.getSalary()));
//		}
		
		Employee defEmp = new Employee(-1, "not found", 0.0f);
		
		Employee e = EmployeeDBHelper.findFromDB(id).orElse(defEmp);
				
		 
		System.out.println("""
				Employee id: %s
				Employee name: %s
				Employee Sal: %s
				""".formatted(e.getId(),e.getName(),e.getSalary()));
		
	}

}
