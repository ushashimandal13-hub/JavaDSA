package assign5;
import java.util.Scanner;
public class Q3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println(" Enter a number ");
		int n = sc.nextInt();
		int num = n;
		int sum= 0;
		while( n > 0) {
			int digit = n%10;
			int fact =1;
			for(int i = 1 ; i<=digit; i++)
				fact = fact *i;
			sum = sum+fact;
			n= n/10;
		}
		if(sum==num)
			System.out.println(num + " is a Strong number ");
		else 
			System.out.println(num+ " is not a Strong number ");
	sc.close();		
		
	}

}
