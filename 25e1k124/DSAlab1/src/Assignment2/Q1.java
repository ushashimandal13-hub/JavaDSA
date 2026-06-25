package Assignment2;
import java.util.Scanner;
class Car {
	String model;
	int year;
	void setDetails() {
		//model=m;
		//year=y;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter model of the car: ");
		model= sc.nextLine();
		System.out.println("Enter the year of the car: ");
		year= sc.nextInt();
	}
	void displayDetails() {
		System.out.println("Car Model: "+model);
		System.out.println("year= "+year);
	}
}
public class Q1 {
public static void main(String[]args) {
		Car ob1=new Car();
		ob1.model="Toyota";
		ob1.year=2020;
		
		Car ob2 = new Car();
		ob2.setDetails();
		
		System.out.println("Enter the model and year of second car: ");
		ob1.displayDetails();
		System.out.println("Enter the model and year of second car: ");
		ob2.displayDetails();
		if(ob1.year>ob2.year)
			System.out.println(ob1.model+" is newer than "+ ob2.model);
		else
			System.out.println(ob2.model+" is newer than "+ ob2.model);
	}
}
