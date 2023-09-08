package com.coforge.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimePrg1 {

	public static void main(String[] args) {
		
		LocalTime t1 = LocalTime.now();
		System.out.println(t1);
		System.out.println(t1.NOON);
		System.out.println(t1.MIDNIGHT);
		System.out.println(t1.MAX);
		System.out.println(t1.MIN);
		System.out.println(LocalTime.of(15, 45, 12, 21345678));
		System.out.println(LocalTime.of(15, 45, 12, 21345678).plusHours(1));
		System.out.println(LocalTime.of(15, 45, 12, 21345678).plusMinutes(12));
		
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("hh:mm a");
		String format = t1.format(dateTimeFormatter);
		System.out.println("Format = "+format);
		
		String format2 = t1.format(dateTimeFormatter);
		
		LocalTime t2 = LocalTime.parse(format2, dateTimeFormatter);
		System.out.println(t2);
		
		LocalDateTime dt1 = LocalDateTime.now();
		System.out.println(dt1);
		System.out.println(LocalDateTime.of(2023, 9, 2, 10, 11, 20));
		
	}
	
}
