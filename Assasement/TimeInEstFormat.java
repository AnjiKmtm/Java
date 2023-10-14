package com.Assasement;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class TimeInEstFormat {
	public static void main(String[] args) {
		Date d = new Date();
		SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss aa");
		timeFormat.setTimeZone(TimeZone.getTimeZone("est"));
		String s2 = timeFormat.format(d);
		System.out.println(s2);

	}

}
