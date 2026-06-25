import java.util.*;
class Q3{
	public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number= ");
    int n = sc.nextInt();
    int sum=0;
    int pro=1;
    int temp= n;
    while(n>0){
      int digit=n%10;
      sum=sum+digit;
      pro=pro*digit;
      n=n/10;
    }
    if(sum==pro)
    System.out.println(temp+"is a spy number");
else
	System.out.println(temp+"is not a spy number");

	}
}