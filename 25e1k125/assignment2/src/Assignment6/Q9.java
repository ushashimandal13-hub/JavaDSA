package Assignment6;
import java.util.Scanner;
public class Q9 {
	public static int rev(int num) {
        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + (num % 10);
            num /= 10;
        }
        return rev;
    }
    public static boolean isPalindrome(int n) {
    	if(n == rev(n))
    	return true;
    	else
    		return false;
    }
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	      
	        System.out.print("Enter an integer: ");
	       int n = sc.nextInt();
	            if (isPalindrome(n)) 
	                System.out.println(n + " is a palindrome.");
	             else 
	                System.out.println(n + " is not a palindrome.");
	                   
	    }
	    
}
	    
