import java.util.*;
class MyStack
{
	int top;
	int arr[];
	final int max;
	MyStack(int max)
	{
	    top=-1;
	    this.max=max;
	    arr=new int[max];

	}
	void push(int ele)
	{
			if(top==max-1)
			{
			    System.out.println("stack overflow ");
			   return ;
			}
			top++;
			arr[top]=ele;
            System.out.println(ele+ " data insert ");
	}
	void pop()
	{
	        if(top==-1)
	        {
	            System.out.println("no element or underflow ");
	            return;
	        }
	        System.out.println("delete element ="+arr[top]);
	        arr[top]=0; // optional
	        top--;
	}
	void peek()
	{
	        if(top==-1)
	        {
	            System.out.println("no element or underflow ");
	            return;
	        }
	        System.out.println("top element ="+arr[top]);
	     
	}
	void disp()
	{
	     if(top==-1)
	        {
	            System.out.println("no element or underflow ");
	            return;
	        }
	        int i=top;
	        while(i>=0)
	        {
	            System.out.println(arr[i]);
	            i--;
	        }
	}
}
class StackQ1
{
	public static void main(String arg[])
	{
	      Scanner sc=new Scanner(System.in);
	      System.out.println("enter stack size ");
	      int size=sc.nextInt();
	      MyStack s=new MyStack(size);
         while(true)
         {
            System.out.println("enter your choice\n1.push\n2.pop\n3.peek\n4.disp\n5.exit");
            int ch=sc.nextInt();
            switch(ch)
            {
               case 1:System.out.println("enter element to push ");
                     s.push(sc.nextInt());
                     break;
               case 2:s.pop();break;
               case 3:s.peek();break;
               case 4:s.disp();break;
               case 5:System.exit(0);
               default :System.out.println("invalid choice ");
            }

         }
	}
}
