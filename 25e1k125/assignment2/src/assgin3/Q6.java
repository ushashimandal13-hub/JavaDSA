package assgin3;
import java.util.Scanner;
public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
		System.out.println("Enter a, b, c : ");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double d = b*b - 4*a*c;
		if(d>0)
		{
		double r1 = (-b + Math.sqrt(d))/2*a;
		double r2 = (-b - Math.sqrt(d))/2*a;
		System.out.println(" The equation has two roots " +r1+ " and " +r2);
		}
		else if (d==0)
		{
			double r = -b / (2*a);
		System.out.println(" The equation has one root "+r);
		}
		else
			System.out.println(" The equation has no real root ");
				
	}

}
