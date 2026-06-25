package assign5;
import java.util.*;
public class Q15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
System.out.println("Enter n (n>3): ");
int n = sc.nextInt();
int a = 0,b = 1,c = 1;
System.out.print(a+" "+b+" "+c);
for(int i = 0; i<n-3 ; i++) 
{
	int d=a+b+c;
	System.out.print(" "+d);
	a=b;
	b=c;
	c=d;
}
	}

}
