import java.util.*;
class Method5{
	public static void main(String[]args){
	Simpleinterest();
	Simpleinterest();
	}
	public static void Simpleinterest(){
		Scanner sc = new Scanner(System.in);
	System.out.println("Enter Principle ");
	int p = sc.nextInt();
	System.out.println("Enter Rate ");
	int r = sc.nextInt();
	System.out.println("Enter Time ");
	int t = sc.nextInt();
    int si = (p*r*t)/100;
		System.out.println("Simple interest = " +si);	
	
	}	
}