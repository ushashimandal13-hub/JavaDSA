import java.util.*;
class nie4{
	public static void main(String[]args){
Scanner sc= new Scanner(System.in);
System.out.println("Enter a number ");
int n= sc.nextInt();
if(n<=9){
System.out.println(" The number is one digit number ");
}else if(n<=99){
System.out.println(" The number is two digits number ");
}else if(n<=999){
System.out.println(" The number is three digits number ");
}else{
	System.out.println(" Others number ");
}
}
}