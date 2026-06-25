package assgin3;

import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int n = sc.nextInt();
		boolean div5 =(n % 5 == 0);
		boolean div6 = (n%6 ==0);
		System.out.println("Is " +n+ " divisible by 5 and 6 ?" +(div5 && div6));
		System.out.println("Is " +n+ " divisible by 5 or 6 ?" +(div5 || div6));
		System.out.println("Is " +n+ " divisible by 5 or 6 , but not both ?" +(div5 ^ div6));
		sc.close();
		
		
		
		
		
		
		
		
	}

}
