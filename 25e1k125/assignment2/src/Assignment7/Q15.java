package Assignment7;
import java.util.*;
public class Q15 {
	    public static void moveZerosToFront(int[] arr) {
	        int n = 10, j = n - 1;
	        for (int i = n - 1; i >= 0; i--) {
	            if (arr[i] != 0) arr[j--] = arr[i];
	        }
	        for (int i = 0; i <= j; i++) arr[i] = 0;
	    }
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int[] arr = new int[10];
	        System.out.println("Enter 10 integers:");
	        for (int i = 0; i < 10; i++)
	        	arr[i] = sc.nextInt();
	        moveZerosToFront(arr);
	        System.out.println("After moving all zeros to the beginning:");
	        for (int v : arr) System.out.print(v + " ");
	    }
	}
