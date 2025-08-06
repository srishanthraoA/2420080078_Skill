package srisproject;
import java.time.*;
import java.util.*;
public class ageprogram {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		 System.out.print("YYYY: ");
	     int year = sc.nextInt();
	     System.out.print("MM: ");
	     int month = sc.nextInt();
	     System.out.print("DD: ");
	     int day = sc.nextInt();
	     LocalDate DateofBirth = LocalDate.of(year, month, day);
	     LocalDate currentDate = LocalDate.now();
	     Period age = Period.between(DateofBirth, currentDate);
         System.out.println("Age is :"+ age.getYears()+" years "+age.getMonths()+" months "+age.getDays()+" days ");  
	}
}