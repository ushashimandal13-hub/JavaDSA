package assignment2;
import java.util.Scanner;
public class q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
		
	System.out.println("Enter basic salary:");
	double basicsalary = sc.nextDouble();
	double DA = basicsalary * 0.4 ;
	double HRA = basicsalary *0.2;
	double grosssalary = basicsalary+ DA +HRA;
	System.out.println("DA is "+DA);
	System.out.println("HRA is " +HRA);
	System.out.println("Gross Salary is " +grosssalary);
		
		
	}

}
