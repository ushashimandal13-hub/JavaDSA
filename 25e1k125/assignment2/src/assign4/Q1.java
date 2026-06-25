package assign4;
import java.util.*;
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		int temp = n;
		int sum = 0;
		while(n>0)
		{
			int remainder = n%10;
			sum = sum+remainder;
			n=n/10;
		}
		if (sum%9 ==0)
			System.out.println("The number " +temp+ " is divisible by 9");
		else
		System.out.println("The number " +temp+ "is not divisible by 9 ");
			sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
