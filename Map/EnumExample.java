package com.java.Map;

import java.time.Month;

public class EnumExample {
	public enum days {
		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
	}

	public static void main(String[] args) {
		System.out.println(days.FRIDAY);
		String month=Month.APRIL.toString();
		System.out.println(month);
	}
}
