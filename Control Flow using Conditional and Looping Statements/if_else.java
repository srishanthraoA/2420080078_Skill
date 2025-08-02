package srisproject;
import java.util.*;
public class if_else {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a string");
	String str=sc.nextLine();
	StringBuilder sb=new StringBuilder(str);
	sb.reverse();
	if(str.contentEquals(sb)) {
		System.out.println("String is a palindrome");
		
	}
	else {
		System.out.println("String is not a palindrome");
	}
}

}
