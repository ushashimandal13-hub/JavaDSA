package assign4;
import java.util.*;
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		do {
		System.out.println("Enter a number (0 to stop) : ");
		n = sc.nextInt();
		if(n==0)break;
		if(n%2==0) 
			System.out.println(n+ " is even.");
		else System.out.println(n+ " is odd.");
		}
		while(n!=0);
		sc.close();
		}

}
