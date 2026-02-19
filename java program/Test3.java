import java.util.*;
class Test3
{
	public static void main(String arg[])
	{
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter a char  ");
	 char ch=sc.next().charAt(0);
	  if(ch>='a' && ch<='z')
	       {
	          ch=(char)(ch-32);
	       }
	       System.out.println(ch);
	  
	}
}