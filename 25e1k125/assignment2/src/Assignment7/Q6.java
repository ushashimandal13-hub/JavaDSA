package Assignment7;
import java.util.*;
public class Q6 {
	/*public static void readArray(int[] arr) {
		Scanner sc = new Scanner(System.in);
		int arr[];
		System.out.println("Enters the elements into the array ");
		int size = sc.nextInt();
		arr[i]= new int[size];
		for(int i=0 ; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
public static void displayArray(int[] arr) {
	System.out.println("Elements in the array: ");
 for( int i = 0; i< arr.length; i++) {
	 System.out.println(arr[i]+" ");
 }
}
public static void findMax(int[] arr) {
int max = arr[0];
for(int i = 1; i<arr.length ; i++) {
	if(arr[i]>max)max = arr[i];
}
return max ;
}
public static void findMin(int[] arr) {
	int min = arr[0];
	for (int i = 1 ; i<arr.length; i++) {
		if(arr[i]>min)min = arr[i];
	}
	return min ;
	}
public static void countOccurences(int[] arr, int value) {
	int count = 0;
	for(int i =)
}
}
public static void main(String[] args) {
	
int arr [] = new int[10];//array creation
readArray(arr);
displayArray(arr);
System.out.println("MAx value = " +findMax(arr)+
		"occurs ="+countOccurences(arr.findmax(arr)+
				"first occurence= "+firstPositionOfMax(arr.findMax(arr)));

}*/
	   public static void readArray(int[] arr) {  
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Enter "+arr.length+" values");
		   for(int i=0 ; i<arr.length; i++) {
			   arr[i]=sc.nextInt();
		   }
	   }
	    public static int findMax(int[] arr) {
	        int max = arr[0];
	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] > max) max = arr[i];
	        }
	        return max;
	    }
	    public static int findMin(int[] arr) {
	        int min = arr[0];
	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] < min) min = arr[i];
	        }
	        return min;
	    }
	    public static int countOccurrences(int[] arr, int value) {
	        int count = 0;
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] == value) count++;
	        }
	        return count;
	    }
	    public static int firstPositionOfMax(int[] arr, int max) {
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] == max) 
	            	return i + 1;
	        }
	        return -1 ;
	    }
	    public static int lastPositionOfMin(int[] arr, int min) {
	     
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] == min) return i + 1;
	        }
	        return -1;
	    }	   
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the size of the array: ");
	        int size = sc.nextInt();
	        int[] arr = new int[size];
	        readArray(arr);
	        int max = findMax(arr);
	        int min = findMin(arr);
	        System.out.println("\nMax value = " + max);
	        System.out.println("It occurs " + countOccurrences(arr, max) + " time(s)");
	        System.out.println("First occurrence position of max = " + firstPositionOfMax(arr, max));
	        System.out.println("\nMin value = " + min);
	        System.out.println("It occurs " + countOccurrences(arr, min) + " time(s)");
	        System.out.println("Last occurrence position of min = " + lastPositionOfMin(arr, min));
	          
	             }
	        }
