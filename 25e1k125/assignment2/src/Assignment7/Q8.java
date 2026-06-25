package Assignment7;
import java.util.*;
public class Q8 {
	    public static void fillArray(int[] arr) {
	        Random rand = new Random();
	        for (int i = 0; i < arr.length; i++) {
	            arr[i] = rand.nextInt(29) + 2; // random between 2 and 30
	        }
	    }
	    public static void printArray(int[] arr) {
	        for (int n : arr) {
	        System.out.print(n+ " ");	      
	        }
	        System.out.println();
	    }
	    public static boolean isPrime(int num) {
		    if (num < 2) return false; 
		    for (int i = 2; i < num; i++) {
		        if (num % i == 0) return false; 
		    }
		    return true;                    
		}
	    public static int countPrimes(int[] arr) {
	        int count = 0;
	        for (int n : arr) {
	            if (isPrime(n)) count++;
	        }
	        return count;
	    }
	    public static void main(String[] args) {
	        int[] arr = new int[10];
	        fillArray(arr);
	        System.out.println("Array elements: ");
	        printArray(arr);
	        int primeCount = countPrimes(arr);
	        System.out.println("Number of prime numbers in the array: " + primeCount);
	    }
	}
	