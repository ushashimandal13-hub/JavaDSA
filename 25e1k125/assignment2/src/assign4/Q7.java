package assign4;
import java.util.*;
public class Q7 {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int n = sc.nextInt();

	        // Part 1: For loop (1 to 3)
	        System.out.println("\nUsing for loop (1 to 3):");
	        for (int i = 1; i <= 3; i++) {
	            System.out.println(n + " x " + i + " = " + (n * i));
	        }

	        // Part 2: While loop (4 to 6)
	        System.out.println("\nUsing while loop (4 to 6):");
	        int i = 4;
	        while (i <= 6) {
	            System.out.println(n + " x " + i + " = " + (n * i));
	            i++;
	        }

	        // Part 3: Do-while loop (7 to 10)
	        System.out.println("\nUsing do-while loop (7 to 10):");
	        int j = 7;
	        do {
	            System.out.println(n + " x " + j + " = " + (n * j));
	            j++;
	        } while (j <= 10);
	    }
	}

