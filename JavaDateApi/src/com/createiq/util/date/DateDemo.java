package com.createiq.util.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
	public static void main(String[] args) {
		Date today = new Date();
		System.out.println(today);
		// mm/dd/yyyy

		Date d2 = new Date(123456);
		System.out.println(d2);

		Date d3 = new Date(2022, 05, 30);
		System.out.println(d3);

		Date d4 = new Date(100, 0, 1);
		System.out.println(d4);

		System.out.println(d4.getTimezoneOffset());

//		Integer i = new Integer(12);
//		System.out.println(Integer.valueOf(12));

		String dateCustomFormat = "MMM/dd/yyyy";
		SimpleDateFormat formatter = new SimpleDateFormat(dateCustomFormat);
		System.out.println(formatter.format(d4));

		SimpleDateFormat s2 = new SimpleDateFormat("dd/mm/yyyy");
		System.out.println(s2.format(d3));
		
		long parse = Date.parse("100/05/30");
		System.out.println(parse);
		
	
	}

}
