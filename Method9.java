//return value with no argumnet
import java.util.*;
class Method9
{
    public static int add()
    {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter Three numbers: ");
        int n1= sc.nextInt();
        int n2= sc.nextInt();
        int n3= sc.nextInt();
        int sum = n1+n2+n3;
        return sum ;
    }
	public static void main(String arg[])
	{
	 int res = add();
	 System.out.println("Sum= "+res);
	  
	}
}