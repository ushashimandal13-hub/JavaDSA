package Assignment7;
import java.util.*;
public class Q3 {
public static void readArray(int[] arr) {
		   Scanner sc = new Scanner(System.in);
		        for (int i = 0; i < arr.length; i++) arr[i] = sc.nextInt();
		    }

		    // Count how many times 'key' appears
		    public static int countOccurrences(int[] arr, int key) {
		        int count = 0;
		        for (int i=0 ; i<arr.length ; i++) {
		        	if (arr[i] == key)
		        		count++;
		        }
		        return count;
		    }

		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        int[] arr = new int[5];
		        System.out.println("Enter 5 integers:");
		        readArray(arr);
		        System.out.print("Enter the number to search: ");
		        int key = sc.nextInt();
		        int occ = countOccurrences(arr, key);
		        System.out.println("The number " + key + " appears " + occ + " time(s) in the array");
		    }
		}
