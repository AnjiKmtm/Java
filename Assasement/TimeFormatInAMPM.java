package com.Assasement;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeFormatInAMPM {

	public static void main(String[] args) {
		SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss aa");
        Date d = new Date();
        System.out.println(d);
        String s1 = s.format(d);
		System.out.println(s1);
	}

	
}
