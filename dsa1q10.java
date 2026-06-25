import java.util.*;
public class dsa1q10{
	public static double sumColumn(double[][] m, int columnIndex){
		double sum=0;
		for(int i=0 ; i<m.length; i++){
             sum= sum+ m[i][columnIndex];
	   } 
	   return sum;	
	   }
public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	double[][]arr=new double[3][4];
	System.out.println("Enetr a 3-by-4 matrix row by row: ");
	for(int i=0; i<3; i++){
		for(int j=0; j<4; j++){
			arr[i][j]=sc.nextDouble();
		}
	}
	System.out.println("The matrix is:");
     for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length; j++) {
        System.out.print(arr[i][j] + " ");
    }
    System.out.println();
}
	for (int col = 0; col < 4; col++) {
            double colSum = sumColumn(arr, col);
            System.out.println("Sum of the elements at column " + col + " is " + colSum);
        }
	}
}