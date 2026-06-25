package assgin3;
import java.util.Scanner;
public class Q7a {
// *using nested if-else
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a year : ");
	   int year = sc.nextInt();
	   
		if (year % 100 == 0)
		{
			if
			(year % 400 == 0)
				System.out.println(year+ " is a leap year ");
			else
				System.out.println(year+ " is not a leap year ");
		}
		else
		{
		if(year % 4 == 0)
		   
			System.out.println(year + " is a leap year ");
	   
	   else 
		   System.out.println(year+ " is not a leap year");
			
		}
		}
}


