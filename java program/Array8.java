import java.util.*;
class Array8
{	
public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter how many elements to add: ");
	int size = sc.nextInt();
	int arr[] = new int[size];
	System.out.println("Enter the value of "+size+ " elements");
	int i=0 , sum=0;
		for( i=0 ; i<size ; i++)
	{
		arr[i] = sc.nextInt();
	}
     for( i=0 ; i<size ; i++){
		sum = sum + arr[i];
	}
	System.out.println("The sum of the values= "+sum);
}
}




