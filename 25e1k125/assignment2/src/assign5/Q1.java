package assign5;
import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method st
		Scanner sc= new Scanner(System.in);
System.out.println(" Enter a number: ");
int n = sc.nextInt();
boolean isPrime = true;
for(int i = 2; i<=n/2; i++)
{
if ( n % i == 0)
		isPrime = false;
}
	if(isPrime)	
	{
		int rev = 0;
		int num = n;
		while ( num>0)
		{
			rev = rev*10 + num%10;
			num = num/10;
		}
		isPrime = true;
		for(int i = 2; i<=rev/2 ; i++)
		{
			
			if(rev%i ==0 )
				isPrime = false;
		}
		if(isPrime)
			System.out.println(n+ " is a twisted prime number ");
		else
			System.out.println(n+ " is not a twisted prime number ");
	}
	else
	
		System.out.println(n+ " is not a prime number ");
	sc.close();
		}
}


