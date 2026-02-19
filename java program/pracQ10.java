import java.util.*;
class pracQ10
{	
public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter how many elements to store in Array[]: ");
	int size = sc.nextInt();
	int arr[]=new int[size];
	System.out.println("Enter the values of "+size+ " elements");
	for(int i=0 ; i<size ; i++)
	{
		arr[i] = sc.nextInt();
	}
     System.out.println("Element store in Array ");
     for(int i=0 ; i<size ; i++){
     	System.out.print(arr[i]+"\t");
     }
	}
}