package assignment2;

import java.util.Scanner;

public class q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	System.out.println(" Enter number of eggs: ");
	int eggs = sc.nextInt();
	int gross = eggs / 144;
	int  remainder = eggs % 144;
	int dozen = remainder / 12;
	int leftover = remainder % 12 ;
	System.out.println( " Total number of egg is " + gross + "gross, " + dozen + " Dozen, and " + leftover + ".");
	}

}
