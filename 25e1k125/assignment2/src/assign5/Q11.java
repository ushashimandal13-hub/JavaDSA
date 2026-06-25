package assign5;
import java.util.*;
public class Q11 {
	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter the first number: ");
		        int n1 = sc.nextInt();
		        System.out.print("Enter the second number: ");
		        int n2 = sc.nextInt();
		        System.out.print("Prime numbers between " + n1 + " and " + n2 + " are: ");
		        for (int num = n1; num <= n2; num++) {
		            if (num > 1) {
		                boolean prime = true;
		                for (int i = 2; i < num; i++) {
		                    if (num % i == 0) {
		                        prime = false;
		                        break;
		                    }
		                }
		                if (prime) {
		                    System.out.print(num + " ");
		                }
		            }
		        }
		    }
	    }