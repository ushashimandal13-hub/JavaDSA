import java.util.*;
class pracQ3{
	public static void main(String[]args){
Scanner sc= new Scanner(System.in);
System.out.println("Enter two number ");
int n1 = sc.nextInt();
int n2 = sc.nextInt();
System.out.println(" Enter your choice: \n 1.Add \n 2.Sub \n 3.Mul \n 4.div");
int ch = sc.nextInt();
if(ch==1)
	//int sum = n1+n2;
	System.out.println( "Addition = " +(n1+n2));
else if(ch==2)
	System.out.println( "Sub = " +(n1-n2));
else if(ch==3)
System.out.println( "Mul = " +(n1*n2));
else if (ch==4)
{
 if(n1==0)
 	System.out.println("0 cannot be divided");
 else
 	//int div = n1/n2;
 	System.out.println("Division=" + (n1/n2));
}
else 
	System.out.println(" Invalid operators ");
}
}
