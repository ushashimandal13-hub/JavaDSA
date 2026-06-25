package assign5;
public class Q7d {
	public static void main(String[] args) {
		int i,j;
		for(i = 1 ; i<=5 ; i++)
		{
			for (j=1 ; j<=i ; j++)
			{
		char character = (char)('A' + (j - 1));
           System.out.print(character+" ");
		}
			System.out.println(" ");
		}
	}

}