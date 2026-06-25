class Obj
{
	static void show()
	{
	    System.out.println("static show method ");
	}
	public static void main(String arg[])
	{
	      show(); //by directly     better   
	      Obj.show(); //by classname
	      Obj t = new Obj();
	      t.show(); //by objectrefernce
	      new Obj().show() ; //by object
	}
}