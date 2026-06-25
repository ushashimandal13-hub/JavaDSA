 //
 class A
{
     void disp()
    {
            System.out.println("disp nonstatic  method");
    }
}
class Test
{
    void look()
    {
          A ob=new A();
          ob.disp();
    }
	public static void main(String arg[])
	{
	    Test t=new Test();
	    t.look();
	}

}