package com.practice.java.common;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;

public class SampleDateFormat {
	
	public static void main(String[] args) {
	
		//List<String> strList = new ArrayList<String>();
		
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 'T' hh:mm:ss");
				
		Calendar cal = Calendar.getInstance();
		long tempDate = date.getTime();
		long currDate = System.currentTimeMillis();
		
		System.out.println("Temp Date: "+tempDate);
		System.out.println("Curr Date: "+currDate);
		
		System.out.println("Calendar Date & Time: "+cal.getTimeInMillis());
		System.out.println("Current Date Time: "+sdf.format(tempDate));
		System.out.println("Calendar Current Date Time: "+sdf.format(cal.getTimeInMillis()));
		
	}
}
