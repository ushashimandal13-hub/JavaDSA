package Assignment7;
import java.util.*;
public class Q14 {
	    public static String decimalToOctal(int decimal) {
	        String octal = "";
	        int n = decimal;
         while (n > 0) {
	            int remainder = n % 8;
	            octal = remainder + octal; // prepend remainder
	            n /= 8;
	        }
	        return octal;
	    }
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a decimal number: ");
	        int decimal = sc.nextInt();
	        String octal = decimalToOctal(decimal);
	        System.out.println("Octal representation: " + octal);
	    }
	}
