package com.cisco.training.basics;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AgeCalculator {

	public static void main(String[] args) {
		System.out.println("Enter Your BirthDay (dd/MM/yyyy): ");
		Scanner kb = new Scanner(System.in);
		String input = kb.nextLine();

		LocalDate today = LocalDate.now();
		LocalDate birtday = LocalDate.parse(input, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
		Period p = Period.between(birtday, today);
		System.out.println("You are "+p.getYears()+" years, "+p.getMonths()+" months and "+p.getDays()+" days old!");
	}

}
