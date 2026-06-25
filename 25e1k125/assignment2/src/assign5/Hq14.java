package assign5;
import java.util.*;
public class Hq14 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :-- ");
		int x = sc.nextInt();
		double n = Math.toRadians(x);
		double cosx = 1.0;
		double term = 1 ; 
		int i = 2;
		do {
			
			term = -(term*n*n)/(i*(i-1));
			i = i+2;
			cosx=cosx+term;
		}
		while(Math.abs(term)>=Math.pow(10, -6));
		System.out.println("Cos("+x+")= " +cosx);
		sc.close();	
	}
}