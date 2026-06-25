package LAB1;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		int temp=num;
		int sum = 0;
		int pro =1;
		while(num > 0) {
			int digit= num%10;
			sum = sum+digit;
			pro = pro*digit;
			num = num/10;
		}
		System.out.println("Sum of digits = "+sum);
		System.out.println("Product of digits = "+pro);
		if(sum == pro)
			System.out.println(temp+" is a spy number");
		else
			System.out.println(temp+" is not a spy number");
	}

}
