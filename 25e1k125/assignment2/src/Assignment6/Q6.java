package Assignment6;
import java.util.*;
public class Q6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	System.out.println("Enter first number: ");
	int m = sc.nextInt();
	System.out.println("Enter sacond number: ");
	int n = sc.nextInt();
    int sumM = sumOfDivisors(m);
    int sumN = sumOfDivisors(n);

    System.out.println("Sum of proper divisors of " + m + " = " + sumM);
    System.out.println("Sum of proper divisors of " + n + " = " + sumN);

    if (isFriendlyPair(m, n)) 
        System.out.println( m + ", " + n + " is a friendly pair.");
     else 
        System.out.println( m + ", " + n + " is NOT a friendly pair.");
    
    if (isFriendlyPair(m, n)) 
        System.out.println("(" + m + ", " + n + ") is a friendly pair.");
    else 
        System.out.println("(" + m + ", " + n + ") is NOT a friendly pair.");
	}  
	public static int sumOfDivisors(int n) {
		int sum = 0;
		for(int i=1 ; i<=n/2 ; i++) {
			if(n % i == 0)
			 sum = sum + i ;
		}
		return sum;
}
public static Boolean isFriendlyPair(int a, int b) {
    // We cast to double to ensure decimal precision during division
    double ratioA = (double) sumOfDivisors(a) / a;
    double ratioB = (double) sumOfDivisors(b) / b;
    return ratioA == ratioB;
}
}
