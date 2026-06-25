import java.util.Scanner;
class Test
{
     public static void main(String arg[])
     {
          Scanner sc=new Scanner(System.in);
          System.out.println("enter two nos");
          int no1=sc.nextInt();
          int no2=sc.nextInt();
          System.out.println("enter your choice\n1.add\n2.sub\n3.mult");
          int ch=sc.nextInt();
         switch(ch)
         {
          case 1:System.out.println("sum="+(no1+no2));break;
         
           case 2: System.out.println("sub="+(no1-no2));break;
         
          case 3:  System.out.println("mult="+no1*no2);break;
         
          default:  System.out.println("invalid choice");
          }
          
     }
}