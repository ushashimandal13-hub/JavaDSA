package Assignment6;
import java.util.*;
public class Q13 {
	public static int countWords(String str) {
str = str.toLowerCase();
	int space = 0;
	for(int i = 0 ; i<str.length();i++) {
		char ch = str.charAt(i);
		if(ch== ' ')
			space++;
	}
          return space+1;
}
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);  
	System.out.print("Enter a string: ");  
	String s1 = sc.nextLine();    
	System.out.println("The number of words in \""+s1+"\" is "+countWords(s1));  
	}  
	}  

