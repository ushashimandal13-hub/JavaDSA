class Employee{
	private String name;
	private int age;
	 private String resg;
	 void init()
	 {
         name="Abhi";
         age = 21;
         resg="Developer";
	 }
	 void disp()
	 {
	     System.out.println("Employee name= "+name);
	     System.out.println("Age= "+age);
	     System.out.println("Resignation= "+resg);
	 }
}
class Oop2
{
	public static void main(String arg[])
	{
	      Employee e2=new Employee();
	     e2.init();
	     e2.disp();
	}
}