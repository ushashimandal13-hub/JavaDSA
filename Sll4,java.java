import java.util.*;
class Node
{
	int data;
	Node next;
}
class SL
{
	static Node head = null ;
	static void create()
	{
		Scanner sc=new Scanner(System.in);
		Node P = new node();
		System.out.println("Enter info / data ");
		P.info = sc.nextInt();
		P.next = null ;
		head = p;
		System.out.println("Do you want to create next, if yes then press y");
				ch=sc.next().charAt(0);
				while(ch!= 'n' || ch!='N'){
					P.next = new node();
					System.out.println("enter info ");
					P.next.info = sc.nextInt();
					P= P.next;
					P.next = null ;
         System.out.println("Do you want to create next, if yes then press y");
			ch=sc.next().charAt(0);
				}
			}
		
	static void disp()
	{
		System.out.println("elements are: ");
		Node ptr=head;
		while(ptr!=null)
		{
			System.out.println(ptr.data);
			ptr=ptr.next;
		}
	}
}
class Sll4
{
	public static void main(String args[])
	{
		SL.create();
		SL.disp();
		
		

	}
}