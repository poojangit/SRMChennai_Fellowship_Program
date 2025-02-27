package com.bridgelabz.builtinfunctions;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

//Problem 1: Time Zones and ZonedDateTime Write a program that displays the current time in different time zones: 
//➢ GMT (Greenwich Mean Time) 
//➢ IST (Indian Standard Time) 
//➢ PST (Pacific Standard Time) 
//Hint: Use ZonedDateTime and ZoneId to work with different time zones. 

public class TimeZones {
	//	Define the time zones
	public static void main(String[] args) {
		ZoneId gmtZone = ZoneId.of("GMT");
		ZoneId istZone = ZoneId.of("Asia/Kolkata");
		ZoneId pstZone = ZoneId.of("America/Los_Angeles");

		//	get the current time in each time zone
		ZonedDateTime gmtTime = ZonedDateTime.now(gmtZone);
		ZonedDateTime istTime = ZonedDateTime.now(istZone);
		ZonedDateTime pstTime = ZonedDateTime.now(pstZone);

		//	format the output
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YYYY-MM-dd HH:mm:ss z");

		//	Display the times
		System.out.println("Current Time in GST : " + gmtTime.format(formatter));
		System.out.println("Current Time in IST : " + istTime.format(formatter));
		System.out.println("Current Time in PST : " + pstTime.format(formatter));
	}

}
