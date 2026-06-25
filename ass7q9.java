import java.util.*;
class ass7q9
{
public static void bubbleSort(double[] arr){
	for(int i=0 ; i<arr.length-1 ;i++){
		for(int j=0 ; j<arr.length-1-i ; j++){
			if(arr[j]>arr[j+1]){
				double temp = arr[j];
			arr[j]=arr[j+1];
			arr[j+1]=temp;
        }
     }
  }
}
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
double [] arr= new double[10];
System.out.println("Enter 10 numbers: ");
for(int i=0; i<10;i++){
	arr[i]=sc.nextDouble();
}
bubbleSort(arr);
System.out.print("Sorted array: ");
for(int i=0; i<arr.length;i++){
		System.out.print(arr[i]+" ");
}
}
}
