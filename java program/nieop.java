import java.util.*;
class nieop{
	public static void main(String[]args){
Scanner sc= new Scanner(System.in);
System.out.println("Enter x , y: ");
int x = sc.nextInt();
int y = sc.nextInt();
System.out.println(" Enter your choice: \n 1.Add \n 2.Sub \n 3.Mul ");
int ch = sc.nextInt();
if(ch==1)
	System.out.println( "Add = " +(x+y));
else if(ch==2)
	System.out.println( "Sub = " +(x-y));
else if(ch==3)
System.out.println( "Mul = " +(x*y));
else 
	System.out.println(" Invalid operators ");
}
}
