package com.coforge.java8;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DatePrg1 {

	public static void main(String[] args) {
		
		Date d1 = new Date();
		
		System.out.println(d1);
		
		Date d2 = new Date(1);
		System.out.println(d2);
		
		d2 = new Date(60*60*100L*24*7);
		System.out.println(d2);
		// Problem date can be changed since its mutable
		
		//Java 8 date
		LocalDate d3 = LocalDate.of(2023, 9, 2);
		System.out.println(d3);
		
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yy");
		String format = d3.format(dateTimeFormatter);
		System.out.println("Format = "+format);
		
		System.out.println(d3.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
		System.out.println(d3.format(DateTimeFormatter.ofPattern("dd-MMM-yyyy")));
		System.out.println(d3.format(DateTimeFormatter.ofPattern("dd-MMMM-yyyy EE")));
		System.out.println(d3.format(DateTimeFormatter.ofPattern("dd-MMMM-yyyy EEEE")));
		System.out.println(d3.format(DateTimeFormatter.ofPattern("dd-MMMM-yyyy EEEE ")));
		
		LocalDate d4 = LocalDate.now();
		System.out.println(d4);
		
		// The Date type is immutable
		System.out.println(d3.plusDays(5));
		
		LocalDate d5 = d3.plusDays(5);
		
		System.out.println(d5.minusMonths(5));
		
		System.out.println(d5.plusYears(5));
	}
	
}
