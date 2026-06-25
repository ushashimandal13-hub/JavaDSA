package Assignment7;
import java.util.Scanner;
public class Q10 {
	public static int[] eliminateDuplicates(int[] list) {
	int[] temp = new int[10];
	int k = 0;
	for (int i = 0; i < 10; i++) {
	int j =0 ;
	for (j = 0; j < k; j++) {
	if (list[i] == temp[j]) break;
	}
	if (j == k) temp[k++] = list[i];
	}
	int[] result = new int[k];
	for (int i = 0; i < k; i++) result[i] = temp[i];
	return result;
}
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int[] arr = new int[10];
	System.out.println("Enter 10 numbers:");
	for (int i = 0; i < 10; i++) arr[i] = sc.nextInt();
	int[] distinct = eliminateDuplicates(arr);
	System.out.print("Distinct numbers: ");
	for (int i = 0; i < distinct.length; i++) System.out.print(distinct[i] + " ");
	sc.close();
	}
}


