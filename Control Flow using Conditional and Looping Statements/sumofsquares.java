package srisproject;
import java.util.Scanner;

public class sumofsquares {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter N:");
		int val=sc.nextInt();
		int sum=0;
		for (int i = 1; i <= val; i++) {
            sum += i * i;
        }

        System.out.println("Sum of squares from 1 to " + val + " is: " + sum);
	}

}
