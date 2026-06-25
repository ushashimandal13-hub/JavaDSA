package assgin3;

import java.util.Scanner;

public class q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Input first number : \n Input second number: \n Input third number : ");
int num1 =sc.nextInt();
int num2 = sc.nextInt();
int num3 =sc.nextInt();

		if (num1 < num2 && num2 <num3)
		System.out.println("\"Increasing\"");
	else if (num1 > num2 && num2 > num3)
		System.out.println("\"Decreasing\"");
		else 
		System.out.println(" Neither Increasing nor decreasing");	
	
		
	
	}

}
