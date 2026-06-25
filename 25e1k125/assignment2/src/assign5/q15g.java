package assign5;
import java.util.Scanner;
public class q15g {

	public static void main(String[] args) {
		        Scanner sc= new Scanner(System.in);
		        System.out.print("Enter a number:");
		        int n= sc.nextInt();
		        int a=0, b=1, c=1;
		        System.out.print(a+" "+b+" "+c);
		        for(int i=0;i<n-3; i++){
		            int d=a+b+c;
		            System.out.print(" "+d);
		            a=b;
		            b=c;
		            c=d; 
		        }
		    }
		}