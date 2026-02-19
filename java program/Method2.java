import java.util.*;
class Method2{
	public static void main(String[]args){
	add();
	add();
	add();
	}

	    public static void add() {
		Scanner sc = new Scanner(System.in);
	System.out.println("Enter first number: ");
	int n1 = sc.nextInt();
	System.out.println("Enter second number: ");
	int n2 = sc.nextInt();
	int sum = (n1+n2);
	int sub = (n1-n2);
	System.out.println("Sum = " +sum);
	System.out.println("Sub = " +sub);



	}
}