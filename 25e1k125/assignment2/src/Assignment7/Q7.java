package Assignment7;
import java.util.*;
public class Q7 {
		/*public static void readArray(int[] arr) {
			Scanner sc = new Scanner(System.in);
			int arr[];
			System.out.println("Enter ten number: ");
			int size = sc.nextInt();
			arr[i]= new int[size];
			for(int i=0 ; i<arr.length; i++) {
				arr[i]=sc.nextInt();
			}
	}
       public static void rotateClockwise(int[] arr) {
    	   for(int i=10 ; i>arr.length-1; i++) {
				arr[i]=sc.nextInt();
       }
}
       public static void printArray(int[] arr) {
    	   
       }
*/
	    public static void readArray(int[] arr) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter 10 numbers:");
	        for (int i = 0; i < 10; i++) {
	            arr[i] = sc.nextInt();
	        }
	    }
	    public static void rotateClockwise(int[] arr) {
	        int last = arr[10 - 1]; // store last element
	        for (int i = 10 - 1; i > 0; i--) {
	            arr[i] = arr[i - 1];        // shift elements to the right
	        }
	        arr[0] = last;                  // place last element at first position
	    }
	    public static void printArray(int[] arr) {
	        for (int i=0 ; i<10 ; i++) {
	            System.out.print(arr[i] + " ");
	        }
	        System.out.println();
	    }
	    public static void main(String[] args) {
	        int[] arr = new int[10];
	        readArray(arr);
	        System.out.println("Array elements before clockwise rotation:");
	        printArray(arr);
	        rotateClockwise(arr);
	        System.out.println("Array elements after clockwise rotation:");
	        printArray(arr);
	    }
	}
