package com.java.Java8Features;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalTimeAndDate {
	public static void main(String[] args) {
		LocalDate date=LocalDate.now();
		System.out.println(date);
		System.out.println(date.getYear());
		LocalDate date1=LocalDate.MIN;
		System.out.println(date1);
		LocalTime time=LocalTime.now();
		System.out.println(time);
		LocalDateTime dt=LocalDateTime.now();
		System.out.println(dt);
		LocalDateTime dt1=LocalDateTime.from(dt);
		System.out.println(dt1);
	}

}
