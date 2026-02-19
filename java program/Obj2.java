class Obj2
{
	 void show()
	{
	    System.out.println("nonstatic show method ");
	}
	public static void main(String arg[])
	{
	     // show(); error  
	      //Test.show(); error 
	      Obj2 t=new Obj2();
	      t.show(); //by objectrefernce
	      new Obj2().show() ; //by nameless object
	}
}
