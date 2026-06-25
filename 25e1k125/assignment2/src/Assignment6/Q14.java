package Assignment6;
import java.util.*;
public class Q14 {
	public static String toTitleCase(String str)  
	{  
	 boolean flag=true; 
	 String res=""; 
	 for (int i = 0; i < str.length(); i++)  
	 {  
	  char ch = str.charAt(i);  
	  if (ch != ' ' && flag==true)  
	  {  
	   ch=Character.toUpperCase(ch); 
	   res=res+ch; 
	   flag=false; 
	  } 
	  else if (ch == ' ')  
	  {  
	   res=res+ch; 
	   flag=true; 
	  }  
	  else  
	  { 
	   res=res+ch; 
	  }  
	 } 
	 return res; 
	}  
	public static void main(String[] args)  
	{  
	 Scanner sc = new Scanner(System.in);  
	 System.out.print("Enter a string: ");  
	 String str = sc.nextLine();    
	 System.out.println("Converted String: "+toTitleCase(str));  
	}  
	} 
