package assgin3;

import java.util.Scanner;

public class Q7c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a year : ");
	   int year = sc.nextInt();
	String result = (year % 100 == 0 ) ? " Not a leap year "
			: (year % 400 == 0 ) ? " a leap year "
			: (year % 4 == 0 ) ? " a leap year "
		    : " Not a leap year " ;
	System.out.println( year + " is " + result);
	sc.close();
	
	
	
	
	
	
	
	
	}

}
