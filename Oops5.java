import java.util.*;
class Square{
int l;
	void disp(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length of the square= ");
		l= sc.nextInt();
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
class Oop5
{
	public static void main(String arg[])
	{
	      Square s = new Square();
	     
	     s.disp();
	     System.out.println("Perimeter of a rectangle= "+ s.perimeter());
	     System.out.println("Area of a rectangle= "+s.area());
	}
}