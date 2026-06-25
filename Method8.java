import java.util.*;
class Method8{
public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Principle ");
	double p = sc.nextDouble();
	System.out.println("Enter Rate ");
	double r = sc.nextDouble();
	System.out.println("Enter Time ");
	double t = sc.nextDouble();
	Simpleinterest(p,r,t);
	}
	public static void Simpleinterest(double p, double r, double t){
    double si = (p*r*t)/100;
		System.out.println("Simple interest = " +si);	
	return;
	}	
}