import  java.util.*;
class Node
{
	int data;
	Node next;

}
class sll2
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
	    Node cur=null,ptr=null,head=null;
	    char ch='y';
	    int c=0;
	    while(ch=='y')
	    {
           cur=new Node();
          c++;
          System.out.println("enter node "+c+ " data ");
           cur.data=sc.nextInt();
           cur.next=null;
            if(head==null)
            {
            	head=cur;
            }
            else
            {
                ptr.next=cur;
            }
            ptr=cur;
            System.out.println("to create new node press y ");
            ch=sc.next().charAt(0);
	    }
	      System.out.println("elements are ");
         ptr=head;
         while(ptr!=null)
         {
            System.out.println(ptr.data);
            ptr=ptr.next;
         }
	}
}