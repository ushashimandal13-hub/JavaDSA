import java.util.*;
class Method4{
	public static void main(String[]args){
	area();
	area();
	}
	public static void area(){
		Scanner sc = new Scanner(System.in);
	System.out.println("Enter length ");
	int l = sc.nextInt();
	System.out.println("Enter bredth ");
	int b = sc.nextInt();
    int area = (l*b);
		System.out.println("The area of this rectangle is " +area);	
	
	}	
}