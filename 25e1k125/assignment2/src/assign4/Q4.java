package assign4;
import java.util.*;
public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
	int user;
	int computer;
	System.out.println("Enter your guess: ");
	user = sc.nextInt();
	computer= (int) (Math.random()*(10-1+1))+1;
	System.out.println("Computer guess : ");
if (user==computer)
	System.out.println("You got it right");
else if (user==computer+1 || user==computer-1)
	System.out.println("You almost got it");
else 
	System.out.println("You got it wrong");
sc.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
