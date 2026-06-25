package Assignment6;
import java.util.Scanner;
public class Q8 {

	public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
            int largest = largestDigit(n);
            System.out.println("Largest digit: " + largest);
    }
		    public static int largestDigit(int n) {
		        int maxDigit = 0; 
		        int number = Math.abs(n);
		        if (number == 0) 
		            return 0;
		        while (number > 0) {		           
		            int digit = number % 10; 
		          
		            if (digit > maxDigit) 
		                maxDigit = digit;
		            
		            number /= 10; 
		        }
		        return maxDigit;
	}

}
