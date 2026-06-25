package assgin3;
import java.util.Scanner;
import java.util.Random;

public class q4again {


		public static void main(String[] args) {
			// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	
	int user = sc.nextInt();
	System.out.println("Enter user number (1-9): ");
	int computer = (int) (Math.random()*(9+1-1))+1;
	
	System.out.println("Computer guesses :" +computer);
	if
	(computer==user)
			System.out.println("You got it right");
	else if 
	(Math.abs(user=computer)==1)
		System.out.println("You almost got it");
	else
		System.out.println("You got it wrong");
		sc.close();
					
		}

	}


