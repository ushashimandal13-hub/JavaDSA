package Assignment7;
import java.util.*;   
public class Q1 {
public static int findSum(int[] arr) {
	        int sum = 0;
	        for (int i = 0; i < arr.length; i++) {
	            sum += arr[i];
	        }
	        return sum;
}
	    public static double findAverage(int[] arr) {
	        return (double) findSum(arr) / arr.length;
	    }
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        Random r = new Random();

	        System.out.print("Enter the size of the array: ");
	        int N = sc.nextInt();
	        int[] arr = new int[N];

	        System.out.print("Random values stored in the array: ");
	        for (int i = 0; i < N; i++) {
	           arr[i] = r.nextInt(100)+1;
	            System.out.print(arr[i] + " ");
	        }

	        System.out.println("Sum of elements = " + findSum(arr));
	        System.out.println("Average of elements = " + findAverage(arr));

	        sc.close();
	    }
	}
                                                                                                                             
	