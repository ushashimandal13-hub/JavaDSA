import java.util.*;
public class Dsa1q12{
	public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	String result = "";
        System.out.println("Enter lines: ");
        while(sc.hasNextLine()){
        	String line = sc.nextLine();
        	if (line.equals(""))  // stop when user presses Enter on empty line
        break;
        	result = line +"\n"+result;
        }
        System.out.println("Lines in reverse order: " +result);
	}
}