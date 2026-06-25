package assignment2;

public class q5p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double x = Double.parseDouble(args[0]);
double y = Double.parseDouble(args[1]);
double z = Double.parseDouble(args[2]);
boolean result = (x<y && y<z) || (x>y && y>z);
System.out.println("Strict Order Check " +x+ " " +y+ " " +z+ " = " +result);
		
		
		
		
		
		
		
		
		
		
		
	}

}
