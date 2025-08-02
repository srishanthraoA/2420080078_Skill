package srisproject;
import java.util.*;

public class Date_example {
	public static void main (String args[]) {
		Date d=new Date();
		System.out.println("Current Date is" +d);
		int month=d.getMonth();
		System.out.println(month);
		int year=d.getYear();
		System.out.println(year);
		System.out.println(d.getMinutes());
		System.out.println(d.getHours());
		
	}

}
