package Assignment7;
import java.util.*;
public class Q11 {
	public static double max(double[] arr) {
		double m = arr[0];
		for(int i=1 ; i<arr.length ; i++) {
			if (arr[i]>m)
				m = arr[i];
		}
		return m;
	}
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        double[] arr = new double[10];

	        System.out.println("Enter ten numbers:");
	        for (int i = 0; i < 10; i++) {
	            arr[i] = sc.nextDouble();
	        }
	        double ans = max(arr);
	        System.out.println("The maximum number is: " + ans);
	    }
	}
