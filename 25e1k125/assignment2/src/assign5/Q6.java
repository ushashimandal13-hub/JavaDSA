package assign5;
import java.util.*;
public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.print("Enter a number ");
int n =sc.nextInt();
double sum =0;
for(int i =1; i<=n; i++)
{
	sum = sum+(1.0/ (i*i));
}
System.out.println("Sum of series =" +sum);
	}
}