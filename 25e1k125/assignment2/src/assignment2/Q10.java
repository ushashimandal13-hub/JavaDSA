package assignment2;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the distance in km: ");
        double km = sc.nextDouble();

        
        double meters = km * 1000;
        double feet = km * 3280.8399;
        double inches = km * 39370.0787;
        double centimetres = km * 100000;

        
        System.out.println(km + " km is " + meters + " meters");
        System.out.println(km + " km is " + feet + " feet");
        System.out.println(km + " km is " + inches + " inches");
        System.out.println(km + " km is " + centimetres + " centimetres");
	
	
	
	
	
	
	}

}
