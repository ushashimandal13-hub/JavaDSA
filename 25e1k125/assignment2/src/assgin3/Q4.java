package assgin3;
import java.util.Scanner;
import java.util.Random;
public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
Random rand = new Random();
int Computer = rand.nextInt(9)+1;
System.out.println("Enter user number (1-9): ");
int user = sc.nextInt();
System.out.println("Computer guesses :" +Computer);
if
(Computer==user)
		System.out.println("You got it right");
else if 
(Computer==user+1 || Computer==user-1)
	System.out.println("Almost got it");
else
	System.out.println("You got it wrong");
	sc.close();
				
	}

}
