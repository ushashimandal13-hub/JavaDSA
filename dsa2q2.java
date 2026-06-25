import java.util.*;
class Complex{
	int r,i;
void setData(int r, int i) {
	this.r=r;
	this.i=i;
}
void display() {
	System.out.println(r+" + "+i+"i");
}
public Complex add(Complex c1 ,Complex c2) {
	Complex res= new Complex();
	res.r = c1.r +c2.r;
	res.i= c1.i+c2.i;
	return res;
}
}
public class complexQ2 {
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	Complex c1= new Complex();
	Complex c2= new Complex();
	Complex result = new Complex();
	System.out.println("Enter first complex number:");
    System.out.print("Real: ");
    int r1 = sc.nextInt();
    System.out.print("Imaginary: ");
    int i1 = sc.nextInt();
    c1.setData(r1, i1);

    System.out.println("Enter second complex number:");
    System.out.print("Real: ");
    int r2 = sc.nextInt();
    System.out.print("Imaginary: ");
    int i2 = sc.nextInt();
    c2.setData(r2, i2);
    result = c1.add(c1, c2);
    System.out.println("Sum is:");
    result.display();
      }
}