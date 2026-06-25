package assign5;
import java.util.Scanner;
public class Q4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first number :" );
		int n1 = sc.nextInt();
		System.out.println("Enter second number :" );
		int n2 = sc.nextInt();
		int maxdiv=0 , maxnum=0;
		for(int i=n1 ; i<=n2 ; i++)
		{
			int cdiv=0;
			for(int j=1 ; j<=i ; j++)
			{
				if(i%j==0)
					cdiv++;
			}
			
			if(cdiv>=maxdiv)
			{
				maxdiv=cdiv;
				maxnum=i;
			}
		}
			System.out.println(" The number with most divisor is " +maxnum);
	System.out.println(" The number of divisor " +maxdiv);
		sc.close();
		}
	}
