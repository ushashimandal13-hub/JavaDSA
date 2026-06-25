class A
{
	static void show()
	{
	    System.out.println("static show method ");
	}
	
}

class Obj3
{
	public static void main(String arg[])
	{
	     // show(); //by directly     error
          A.show();  //    by classname  better    
          A ob=new A();
          ob.show();  // valid not required
	}  

}