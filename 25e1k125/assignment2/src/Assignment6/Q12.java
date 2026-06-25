package Assignment6;
import java.util.*;
public class Q12 {

	//
		// TODO Auto-generated method stub
		public static int countVowels(String str) {
			int c = 0;
			for(int i=0; i<str.length();i++) {
				char ch = str.charAt(i);
				if(ch=='A'||ch=='a'||ch=='E'||ch=='e'||ch=='I'||ch=='i'||ch=='O'||ch=='o'||ch=='U'||ch=='u')
					c++;
			}
			return c;
	}
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a string: ");
			String str = sc.nextLine();
			System.out.println("The number of vowels in \""+ str +"\" is " +countVowels(str));
				
			}
		}


