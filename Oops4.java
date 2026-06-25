class Square{
int l;
	{
		l = 3;
	}
	void disp(){
		System.out.println("Length of the square= "+l);
	}
	int perimeter(){
		int peri= (4*l);
		return peri;
	}
	int area(){
		int area=(l*l);
		return area;
	}
	}
class Oop4
{
	public static void main(String arg[])
	{
	      Square s = new Square();
	     
	     s.disp();
	     System.out.println("Perimeter of a rectangle= "+ s.perimeter());
	     System.out.println("Area of a rectangle= "+s.area());
	}
}
