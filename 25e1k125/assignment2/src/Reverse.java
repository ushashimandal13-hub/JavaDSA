import java.util.*;
public class Reverse {
	public static void main(String[] args) {
Scanner sc = new Scanner (System.in);
int i;
int arr[] = new int[10];
System.out.println("Enter the array elements: ");
for(i=0 ; i<10 ; i++) {
	arr[i]= sc.nextInt();
	System.out.println("Dispaly array elements: ");
	for(i=0 ; i<10 ; i++) {
		System.out.println(arr[i]+" ");
	}
}
		int n=10 ;
		for(i=0; i<n; i++) {
			for(int j=i+1 ; j<n; j++) {
				{
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i]= arr[j];
					arr[j] = temp;
				}
			}
		System.out.println("Display the soretd array: ");
		for ( i = 0 ; i<n; i++)
			System.out.print(arr[i] + "");
			}
		}
	}
}

