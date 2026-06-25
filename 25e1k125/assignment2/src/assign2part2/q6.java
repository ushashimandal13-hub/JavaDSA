package assign2part2;

public class q6 {

	public static void main(String[] args) {
		        int a = Integer.parseInt(args[0]);
		        int b = Integer.parseInt(args[1]);
		        int c = Integer.parseInt(args[2]);

		        int min = Math.min(a, Math.min(b, c));
		        int max = Math.max(a, Math.max(b, c));
		        int mid = a + b + c - min - max;

		    System.out.println("Ascending order: " + min + " " + mid + " " + max);
		    System.out.println("Descending order: " + max + " " + mid + " " + min);
	}
		}

	


