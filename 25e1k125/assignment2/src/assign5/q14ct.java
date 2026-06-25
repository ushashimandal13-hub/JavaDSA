package assign5;
import java.util.Scanner;
public class q14ct {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a number :-- ");
	        int x = sc.nextInt();

	        double n = Math.toRadians(x); // convert to radians
	        double cosx = 1.0;            // first term of cosine series
	        double term = -(n * n) / 2.0; // second term: -x^2 / 2!
	        int i = 2;                     // factorial counter

	        do {
	            cosx = cosx + term;
	            i = i + 2;
	            term = -(term * n * n) / (i * (i - 1));
	        } while (Math.abs(term) >= Math.pow(10, 6));

	        System.out.println("Cos(" + x + ") = " + cosx);
	        sc.close();
	    }
	}


