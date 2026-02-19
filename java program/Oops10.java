
class Student
{
	 private String name;  
	  private   int rollno;
	   private   double mark;
     void set(String n,int r,double m)    //initlization
     {
          
         name=n;
         rollno=r;
         mark=m;
     }
     void disp()
     {
        System.out.println("my name= "+name);
         System.out.println("my rollno= "+rollno);
          System.out.println("my mark= "+mark);
     }
}class Oop10
{
	public static void main(String arg[])
	{

	   Student s=new Student();
	   s.set("muna",1,90.50);
	 
	  Student s1=new Student();
	   s1.set("kuna",2,80.50);
	    s.disp();
	  s1.disp();
	}
}