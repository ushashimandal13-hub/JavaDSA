package assgin3;
import java.util.*;
public class Q15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner sc = new Scanner(System.in);
		        String[] names = {"Scissor", "Rock", "Paper"};

		        int computer = (int)(Math.random() * 3);

		        System.out.print("scissor (0), rock (1), paper (2): ");
		        int user = sc.nextInt();

		        if (user < 0 || user > 2) {
		            System.out.println("Invalid input! Enter 0, 1 or 2.");
		            return;
		        }

		        System.out.println("The computer is " + names[computer] + ".");
		        System.out.println("You are " + names[user] + ".");

		        if (computer == user) {
		            System.out.println("It's a draw!");
		        } else if ((user == 0 && computer == 2) ||
		                   (user == 1 && computer == 0) ||
		                   (user == 2 && computer == 1)) {
		            System.out.println("You won!");
		        } else {
		            System.out.println("You lost!");
		        }

		        sc.close();
		    }
		

	}


