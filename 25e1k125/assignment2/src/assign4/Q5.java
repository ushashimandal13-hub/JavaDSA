package assign4;
import java.util.*;
public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int n1 = sc.nextInt();
		System.out.println("Enter the second number : ");
		int n2 = sc.nextInt();
		System.out.println("Enter the third number : ");
		int n3 = sc.nextInt();
		int sum = 0 ;
		for(int i = n1; i<=n2 ; i= i+n3) {
			System.out.println(i+" ");
			sum = sum+i;
			
		}
		System.out.println("\nThe sum of number displayed is" +sum);
		
		sc.close();
		
		
		
		
		
	}

}
