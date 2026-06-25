package assgin3;
import java.util.*;
public class Q8lab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc =new Scanner(System.in);
System.out.println("Enter units consumer:");
int units = sc.nextInt();
double bill = sc.nextDouble();

		if (units<=50)
			bill = units*3.0;
		else if (units<=200)
		bill = 50*3.0+(units-50)*4.80;
		else if (units<=400)
		bill= 50*3.0+150*4.80+(units-200)*5.80;
		else
          bill= 50*3.0+150*4.80+(units-200)*5.80;
		System.out.println("Do you want to pay online(Y/N) : ");
		char ch = sc.next().charAt(0);
		if (ch=='Y' || ch=='y')
		{
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
