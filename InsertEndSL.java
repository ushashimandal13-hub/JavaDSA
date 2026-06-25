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

	static void insertEnd(){
	Scanner sc = new Scanner(System.in);
    System.out.print("Enter the element to insert: ");
      int ele = sc.nextInt();
      Node cur = new Node();
       cur.data=ele;
	     cur.next=null;
	     if(head == null ){
         head=cur;
	      }else{
	            	Node ptr = head ;
	            	while(ptr.next != null){
	            		ptr = ptr.next;
	            	}
	            	ptr.next = cur ;
	            }
	              System.out.println(ele+" data inserted at the end!");
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
class InsertEndSl
{
	public static void main(String args[])
	{
		SL.create();
		SL.disp();
		SL.insertEnd();
		SL.disp();
		
		

	}
}