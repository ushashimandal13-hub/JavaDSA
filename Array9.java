import java.util.*;
class Array9
{	
public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter how many elements to multiply: ");
	int size = sc.nextInt();
	int arr[] = new int[size];
	System.out.println("Enter the value of "+size+ " elements");
	int i=0 , mul=1;
		for( i=0 ; i<size ; i++)
	{
		arr[i] = sc.nextInt();
	}
     for( i=0 ; i<size ; i++){
		mul = mul + arr[i];
	}
	System.out.println("The multiply of the values= "+mul);
}
}