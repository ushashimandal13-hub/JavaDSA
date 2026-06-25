package Assignment7;
import java.util.*;
public class Q13 {
	    public static void fillArray(int[] arr) {
	        Random r = new Random();
	        for (int i = 0; i < 10; i++)
	            arr[i] = 50 + r.nextInt(51);
	    }
	    public static void printArray(int[] arr) {
	       for(int i=0 ; i<10 ; i++) {
	    	   System.out.print(arr[i]+" ");
	       }
	       System.out.println(" ");
	    }
	    public static void reverseArray(int[] arr) {
	        int i = 0; int j=arr.length-1;
	        		while(i<j) {
	            int t = arr[i];
	            arr[i] = arr[j];
	            arr[j] = t;
	            i++;
	            j--;
	        }
	    }
	    public static void main(String[] args) {
	        int[] arr = new int[10];
	        fillArray(arr);
	        System.out.println("Original array:");
	        printArray(arr);
	        reverseArray(arr);
	        System.out.println("Reversed array:");
	        printArray(arr);
	    }
	}
