/*Question-7: 
Write a java program to print M-by-N array in the tabular format. Also, display the sum of 
elements of the array.  
Sample Run: 
Enter number of Row and Columns of 2D-Array: 3 3 
Enter elements of 2D-Array: 1 2 3 2 3 4 3 4 5 
The elements of 2D array are: 
1 2 3
2 3 4
3 4 5
The sum of elements of the 2D-Array is 27
*/
import java.util.*;
class arr2dq9{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int arr[][];
	System.out.println("Enter number of Row and Colomuns of 2D-Array: ");
	int r = sc.nextInt();
	int c= sc.nextInt();
    arr=new int [r][c];
    System.out.println("Enter "+r*c+" elements of 2D-Array= ");
	for(int i=0; i<r; i++){
		for(int j=0; j<c; j++){
		arr[i][j]= sc.nextInt();	
		}
	}
	System.out.println("Elements are ");
         for(int i=0 ; i<r ; i++){
	     for(int j=0 ; j<c ; j++){
	     	System.out.print(arr[i][j]+" ");
	}
	System.out.println();
} int sum=0;
for(int i=0; i<arr.length;i++){
	for(int j=0; j<arr[i].length;j++){
        sum+=arr[i][j];
	}
}
   System.out.println("The sum of elements of the 2D-Array is= "+sum);
	}
}