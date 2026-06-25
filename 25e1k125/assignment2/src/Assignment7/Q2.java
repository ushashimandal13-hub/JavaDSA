package Assignment7;
import java.util.*;
public class Q2 {
	public static void readInput(int[] counts) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter elements: ");
	int n = sc.nextInt();

    while (n != 0) {
        if (n > 0 && n < counts.length) {
            counts[n]++;
        }
        n = sc.nextInt();
    }
}
	public static void displayCounts(int[] counts) {
		for(int i=1 ; i<counts.length; i++)
		{
			if (counts[i]>0)
System.out.println(i+ " Occurs "+counts[i]+((counts[i]>1)?
		                      " times ":" time "));
		}
	}
	public static void main (String [] args) {
		// TODO Auto-generated method stub
		int counts[]= new int[101];
		readInput(counts);
		displayCounts(counts);
	}
	}


