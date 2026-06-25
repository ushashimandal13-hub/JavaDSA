package LAB1;
public class Q1 {

	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		int temp = num;
		if(num>2) {
			System.out.println("Enter a +ve integer greater than 2. ");
		}
	int count = 0;
	while(num>2) {
		num = num/2;
		count++;
	}
	System.out.println("The +ve integer from command line arg is= "+temp);
	System.out.println("The number of times one must repeatedly"
			+ " divide this number by 2 before getting a value less than 2 is= "+count);
		
	}

}
