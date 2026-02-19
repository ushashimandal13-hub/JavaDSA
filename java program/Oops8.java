import java.util.*;
class Student
{
	private String name;
	private int roll;
	 private double mark;
	 Student(String n,int r,double mark)  //constructor call when object create
	 {
	  
         name=n;
         roll=r;  
         this.mark=mark;
	 }
	 void disp()
	 {
	     System.out.println("Student Name= "+name);
	     System.out.println("Student Roll no.= "+roll);
	     System.out.println("Students Marks= "+mark);
	 }
}
class Oop8
{
	public static void main(String arg[])
	{
	     Scanner sc=new Scanner(System.in);
	     System.out.println("Enter name of the student: ");
         String n=sc.nextLine();
         System.out.println("Enter roll no. of the student: ");
         int r=sc.nextInt();
         System.out.println("Enter marks of the student: ");
         double mark=sc.nextDouble();
	     Student s=new Student(n,r,mark);
	     s.disp();
	    
	}
}
