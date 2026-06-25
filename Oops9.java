import java.util.*;
class Student
{
	private String name;
	private int roll;
	private double mark;
	
	 Student(String n,int r,double mark)
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
class Oop7
{
	public static void main(String arg[])
	{
	      Student arr[]={new Student("A",1,90.50),new Student("B",2,80.50),new Student("C",3,70.50)};
	      for(int i=0;i<arr.length;i++)
	      {
	      	arr[i].disp();
	      }
	   
	       
	}
}