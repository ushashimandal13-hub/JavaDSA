import java.util.*;
class Car {
	String model;
	int year;
	 void setDetails(String m, int y) {
		 model=m;
	     year=y;
	}
	void displayDetails() {
		System.out.println("Car Model: "+model);
		System.out.println("year= "+year);
	}
}
public class Q1{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Car ob1=new Car();
		ob1.setDetails("Honda", 2022);
		Car ob2 = new Car();		
		System.out.println("Enter the model of 2nd car: ");
		String m = sc.nextLine();
		System.out.println("Enter the manufracture year: ");
		int y = sc.nextInt();
		ob2.setDetails(m, y);
		ob1.displayDetails();
		ob2.displayDetails();
		if(ob1.year>ob2.year)
			System.out.println(ob1.model+" is newer than "+ ob2.model);
		else
			System.out.println(ob2.model+" is newer than "+ ob2.model);
		sc.close();
	}
}
