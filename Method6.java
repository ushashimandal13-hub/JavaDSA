//no retun with arguments.
import java.util.Scanner;
class Method6
{
	    public static void add(int n1 , int n2 , int n3) 
	    {
		
        int sum =n1+n2+n3;
        System.out.println("Sum"+sum);
       
        return ;
        }
        public static void main(String[]args)
        {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        add(n1,n2,n3);
	
	
	}
}