package assgin3;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println (" Enter the first side :\n Enter second side : \n Enter third side : ");
int a = sc.nextInt();
int b = sc.nextInt();
int c = sc.nextInt();
if (a+b>c && b+c>a && c+a>b)
{
	if (a==b && b==c)
		System.out.println(" The triangle is Equilateral.");

else if (a==b || b==c || a==c)
	System.out.println("The triangle is Isosceles");

else
	System.out.println("The given sides do not form a valid triangle.");

}
}
}
