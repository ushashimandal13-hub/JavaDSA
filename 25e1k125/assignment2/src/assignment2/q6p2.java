package assignment2;

public class q6p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a = Integer.parseInt(args[0]);
int b = Integer.parseInt(args[1]);
int c = Integer.parseInt(args[2]);
int max = Math.max(a,Math.max(b, c));
int min = Math.min(a,Math.min(b, c));
int mid = (a+b+c)-(max+min);
System.out.println(" Ascending order : " +min+ " " +mid+ " " +max);

System.out.println(" Descending order : " +max+ " " +mid+ " " +min);		
	}

}

