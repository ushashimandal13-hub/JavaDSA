package assign5;

import java.util.*;

public class Hq13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :-- ");
		int x = sc.nextInt();
		double n = Math.toRadians(x);
		double term = n , sinx = n , i = 1;
		do {
			i = i+2;
			term = - term*n*n/(i*(i-1));
			sinx=sinx+term;
		}
		while(Math.abs(term)>=Math.pow(10, -6));
		System.out.println("Sin("+x+")= " +sinx);
		sc.close();
		
		
	}

}
