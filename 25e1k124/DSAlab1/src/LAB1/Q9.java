package LAB1;
import java.util.*;
public class Q9 {
	public static double sumMajorDiagonal(double[][] m){
		double sum = 0;
        for(int i=0 ; i<m.length; i++){
        	for(int j=0 ; j<m[i].length; j++){
        		if(i==j)
        			sum+=m[i][j];
        		}
	        }
        return sum;
        }
   public static void main(String[]args){
   	Scanner sc = new Scanner(System.in);
       double[][] arr = new double[4][4]; 
       System.out.println("Enter a 4-by-4 matrix row by row: ");
       for (int i = 0; i < 4; i++) {
           for (int j = 0; j < 4; j++) {
               arr[i][j] = sc.nextDouble();
           }
       }
           for(int i=0; i<arr.length ; i++){
           	for( int j=0; j<arr[i].length ; j++){
           		System.out.print(" "+arr[i][j]);
           	}
            System.out.println(" ");
       }
          double result = sumMajorDiagonal(arr);
          System.out.println("Sum of the elements in the major diagonal is= "+result);
	}
}