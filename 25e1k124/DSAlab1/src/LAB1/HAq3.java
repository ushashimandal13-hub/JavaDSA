package LAB1;
import java.util.*;
public class HAq3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        // 1. Get size
        System.out.print("Enter size n: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        // 2. Fill array a
        System.out.println("Enter values for matrix A:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        // 3. Fill array b
        System.out.println("Enter values for matrix B:");
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        // 4. Calculate product and print immediately
        System.out.print("Result array c: ");
        for (int i = 0; i < n; i++) {
            c[i] = a[i] * b[i];        
            // Print the value followed by a space
            System.out.print(c[i] + " "); 
        }
    }
}
	