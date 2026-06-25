package LAB1;
import java.util.*;
public class Q2 {
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter person weight in kg: ");
double wg = sc.nextDouble();
System.out.println("Enter height of person in meter: ");
double hg = sc.nextDouble();
double bmi = wg/(hg*hg);
if(bmi<18.5)
	System.out.println("the person is underweight.");
else if(bmi>=18.5 && bmi<=24.9)
	System.out.println("The person is normal weight.");
else if(bmi>=25.0 && bmi<=29.9)
	System.out.println("The person is overweight.");
else
	System.out.println("The person is obese");
	}

}
