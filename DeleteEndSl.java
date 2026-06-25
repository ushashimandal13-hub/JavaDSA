import java.util.*;
class Node
{
	int data;
	Node next;
}
class SL
{
	static Node head; //this means SL has a Node
	static void create()
	{
		Scanner sc=new Scanner(System.in);
		Node  cur=null, ptr=null;
			char ch='y';
			int c=0;
			while(ch=='y')
			{
				c=c+1;
				cur=new Node();
				System.out.println("enter node"+c+" data:");
				cur.data=sc.nextInt();
				cur.next=null;
				if(head==null)
				{
					head=cur;
				}
				else{
					ptr.next=cur;
				}
				ptr=cur;
				System.out.println("Do you want to create next, if yes then press y");
				ch=sc.next().charAt(0);
			}
	}

	static void deleteEnd(){
	if(head == null){
		System.out.println("List is empty, not to delete");
	}else{
		Node ptr = head ;
		while(ptr.next.next != null){
			ptr = ptr.next;
		}
		System.out.println(ptr.next.data + " deleted from end");
		ptr.next= null ;
	}
	}
	static void disp()
	{
		System.out.println("Elements are: ");
		Node ptr=head;
		while(ptr!=null)
		{
			System.out.println(ptr.data);
			ptr=ptr.next;
		}
	}
}
class DeleteEndSl
{
	public static void main(String args[])
	{
		SL.create();
		SL.disp();
		SL.deleteEnd();
		SL.disp();
	}
}