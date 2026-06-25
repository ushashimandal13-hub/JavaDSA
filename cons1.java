class Student
{
	String name;
	int rollno;
	double mark;
	Student()
	{
	    name="muna";
	    rollno=1;
	    mark=90.50;
	}
    void disp()
    {
       System.out.println(name+" "+rollno+" "+mark);
    }

}
class cons1
{
	public static void main(String arg[])
	{
	   Student s=new Student();
	   s.disp();
	   Student s1=new Student();
	   s1.disp();
	}
}