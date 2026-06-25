package assign2part2;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        
        boolean result = ((a % b == 0)|| (b % a == 0));
	System.out.println( " Evenly divides " +a+ " " +b+ " -----> " + result);
	}
}
