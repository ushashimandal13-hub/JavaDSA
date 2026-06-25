//return value with no argumnet
import java.util.*;
class Method10
{
    public static int check()
    {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n= sc.nextInt();
        if (n%2 ==0)
            return 0;
        else
            return 1;
    }
	public static void main(String [] args)
	{
	 int res = check();
	  if(res == 0)
        System.out.println("The number is a even number ");
    else
    System.out.println("The number is a odd number ");

	}
}