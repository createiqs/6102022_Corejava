package com.createiq.util.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class CalenderDemo {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar);

		Calendar calendar2 = new GregorianCalendar();
		calendar2.add(Calendar.DATE, -100);
		System.out.println(calendar2.getTime());
		
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy/mm/dd");
		

	}

}
