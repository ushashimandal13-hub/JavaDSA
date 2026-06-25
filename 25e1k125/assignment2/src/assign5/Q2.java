package assign5;
import java.util.Scanner;
public class Q2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter First number ");
		int n1 = sc.nextInt();
	    System.out.println(" Enter the second number");
		int n2 = sc.nextInt();
		int sum1 = 0 , sum2 = 0;
		for(int i = 1; i<=n1/2; i++)
		{
			if(n1 % i==0)
               sum1 = sum1+i;
		}
		for(int i = 1 ; i<=n2/2 ; i++)
		{
			if(n2%i==0)
		sum2 = sum2+i;
		}
		if(sum1==n2 && sum2==n1)
			System.out.println(n1+ " and " +n2 + " are amicable number ");
		else
			System.out.println(n1+ " and " +n2+ " are not amicable number ");
		sc.close();
		}	
	}


