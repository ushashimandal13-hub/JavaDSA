package Assignment6;
import java.util.*;
public class Q5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n= sc.nextInt();
        if (n > 0) {
            int length = collatzLength(n);
            System.out.println("The Collatz length for " + n + " is: " + length);
            }
        else 
            System.out.println("Error: Please enter a positive integer.");
	}
		public static int collatzLength(int n) {
			//even n/2 odd 3n+1
			int count = 0;
			while(n>1)
			{
				if(n%2==0)//even
					n=n/2;
				else//odd
					n= 3*n+1;
				count++;
			}
			return count;
		}
}
