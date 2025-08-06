package srisproject;
import java.util.*;
import java.time.*;
public class employeelogin_program {
public static void main(String args[]) {
	LocalTime lt=LocalTime.of(9, 00);
	LocalTime lt1=LocalTime.of(18, 00);
	System.out.println("The Office hours are from "+ lt + " to " + lt1);
	LocalTime login= LocalTime.of(9, 15);
	LocalTime logoff=LocalTime.of(17, 45);
	System.out.println("The login time is: "+ login +" and The log off time is: "+logoff);
	LocalTime ct=LocalTime.now();
	System.out.println("The current time is: " + ct);
	if(ct.isAfter(lt)&&ct.isBefore(lt1)) {
		System.out.println("Employee is logged in during the office hours ");
		
	}
	else {
		System.out.println("Employee is not logged in during the office hours");
		
	}
	 Duration diff=Duration.between(lt, lt1);
	 System.out.println("Total working hours: "+ diff.toHours()+ " Hours");
	
	
	
}
}
