import java.util.*;
class Student
{
	private String name;
	private int roll;
	 private double mark;
	 void init()
	 {
	     Scanner sc=new Scanner(System.in);
	     System.out.println("Enter name of the student: ");
         name=sc.nextLine();
         System.out.println("Enter roll no. of the student: ");
         roll=sc.nextInt();
         System.out.println("Enter marks of the student: ");
         mark=sc.nextDouble();
	 }
	 void disp()
	 {
	     System.out.println("Student Name="+name);
	     System.out.println("Student Roll no.= "+roll);
	     System.out.println("Students Marks= "+mark);
	 }
}
class Oop6
{
	public static void main(String arg[])
	{
	      Student s = new Student();
	    
	     s.init();
	     s.disp();
	       
	}
}