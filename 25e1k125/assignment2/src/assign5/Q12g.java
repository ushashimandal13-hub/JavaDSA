package assign5;
import java.util.*;
public class Q12g {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.print("Enter the value of m : ");
int n1 = sc.nextInt();
System.out.print("Enter the value of n : ");
int n2 = sc.nextInt();
if(n1 < n2 && n1 > 0 && n2 > 0)
{
	for(int i = n1; i <= n2; i++) 
    {
       int fact = 1;
      for (int j = 1; j <= i; j++)
        fact *= j;
      System.out.println("Factorial of " +i+ " is= " +fact);
    }
}
else
	System.out.println("Invalid input"); 
    } 
    }
