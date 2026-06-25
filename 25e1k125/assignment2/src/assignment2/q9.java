package assignment2;
import java.util.Scanner;
public class q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner (System.in);
	System.out.println("Enter a number between 0 and 1000");
	
	
	int num = sc.nextInt();
	int sum = 0;
	int originalnum = num;
	
	while (num>0) {
		int digit = num % 10;
		sum += digit ;
		num /= 10;
	}
	System.out.println("The sum of digits of " + originalnum + " is " + sum);
	
	
	
	
	
	}

}
