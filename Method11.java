//return value with argument


import java.util.Scanner;
class Method11
{
    public static int add(int n1,int n2,int n3)
    {
         
        int sum = n1+n2+n3;
       
        return sum;
    }
	public static void main(String arg[])
	{
	 Scanner sc=new Scanner(System.in);
        System.out.println("Enter three numbers ");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
	  int res=add(n1,n2,n3);
	  System.out.println("sum="+res);
	  
	}
}