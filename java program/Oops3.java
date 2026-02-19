import java.util.*;
class Rectangle{
	private double l;
	private double b;
	void init()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of the rectangle: ");
		l=sc.nextDouble();
		System.out.println("Enter breadth of the rectangle: ");
		b=sc.nextDouble();
	}
	void disp(){
		System.out.println("Length of the rectangle= "+l);
		System.out.println("Breadth of the rectangle= "+b);
	}
	double perimeter(){
		double peri= (2*(l*b));
		return peri;
	}
	double area(){
		double area=(l*b);
		return area;
	}
	}
class Oop3
{
	public static void main(String arg[])
	{
	      Rectangle r = new Rectangle();
	     r.init();
	     r.disp();
	     System.out.println("Perimeter of a rectangle= "+ r.perimeter());
	     System.out.println("Area of a rectangle= "+r.area());
	}
}
