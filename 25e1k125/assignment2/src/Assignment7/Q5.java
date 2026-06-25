package Assignment7;
import java.util.*;
public class Q5 {
	    public static int findSecondLargest(int[] arr) {
	        int largest = Integer.MIN_VALUE;
	        int secondLargest = Integer.MIN_VALUE;
	        for (int num : arr) {
	            if (num > largest) {
	                secondLargest = largest; // old largest becomes second largest
	                largest = num;           // new largest
	            } else if (num > secondLargest && num < largest) {
	                secondLargest = num;     // candidate for second largest
	            }
	        }
	        return secondLargest;
	    }
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the number of elements: ");
	        int n = sc.nextInt();
	        int[] arr = new int[n];
	        System.out.println("Enter " + n + " integers:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }
	        int secondLargest = findSecondLargest(arr);
	        System.out.println("The second largest value in the array is: " + secondLargest);
	        sc.close();
	    }
	}


