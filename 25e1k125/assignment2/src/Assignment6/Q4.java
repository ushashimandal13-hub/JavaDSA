package Assignment6;
import java.util.*;
public class Q4 {
	public static double area(int n, double side) {
		 return n*Math.pow(side,  2)/(4*Math.tan(Math.PI/n));
		 
	}
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter number of sides: ");
int n = sc.nextInt();
System.out.print("Enter length of each side: ");
double side = sc.nextDouble();
double a = area(n, side);
System.out.print("Area of the regular polygon: " +a);
	}

}
