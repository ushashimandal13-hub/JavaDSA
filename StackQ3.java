import java.util.*;
class MyQueue
{
	int front,rear;
	int arr[];
	final int max;
	MyQueue(int max)
	{
	    front=-1;
	    rear=-1;
	    this.max=max;
	    arr=new int[max];

	}
	void enqueue(int ele)
	{
			if(rear==max-1)
			{
			    System.out.println("Q overflow ");
			   return ;
			}
			if(front==-1)
			{
				 front=0;
			}
			rear++;
			arr[rear]=ele;
            System.out.println(ele+ " data insert ");
	}
	void dequeue()
	{
	        if(front==-1)
	        {
	            System.out.println("no element or underflow ");
	            return;
	        }
	        System.out.println("delete element ="+arr[front]);
	        if(front==rear)
	        {
	        	   front=-1;
	        	   rear=-1;
	        	   return ;
	        }
	        front++;
	}

	void peek()
	{
	        if(front==-1)
	        {
	            System.out.println("no element or underflow ");
	            return;
	        }
	        System.out.println("top element ="+arr[front]);
	     
	}
	void disp()
	{
	     if(front==-1)
	        {
	            System.out.println("no element or underflow ");
	            return;
	        }
	        int i=front;
	        while(i<=rear)
	        {
	            System.out.println(arr[i]);
	            i++;
	        }
	}
}
class MyQueueTest
{
	public static void main(String arg[])
	{
	      Scanner sc=new Scanner(System.in);
	      System.out.println("enter queue size ");
	      int size=sc.nextInt();
	      MyQueue s=new MyQueue(size);
         while(true)
         {
            System.out.println("enter your choice\n1.insert\n2.delete\n3.peek\n4.disp\n5.exit");
            int ch=sc.nextInt();
            switch(ch)
            {
               case 1:System.out.println("enter element to insert ");
                     s.enqueue(sc.nextInt());
                     break;
               case 2:s.dequeue();break;
               case 3:s.peek();break;
               case 4:s.disp();break;
               case 5:System.exit(0);
               default :System.out.println("invalid choice ");
            }

         }
	}
}




