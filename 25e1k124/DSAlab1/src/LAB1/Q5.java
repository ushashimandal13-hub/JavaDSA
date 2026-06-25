package LAB1;
import java.util.Scanner;
public class Q5 {
		public static int SumofDigit(int n) {
			int sum;
			while(n>=10) {
			sum = 0;
			while(n > 0) {
			int digit= n%10;
			sum = sum+digit;
			n = n/10;
			}
			n = sum;
			}
		return n ;
			}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number:");
			int num = sc.nextInt();
			int res = SumofDigit(num);
			System.out.println("Sum of digits of until "+num+" the number is a single digit is= "+res);
	}
}
