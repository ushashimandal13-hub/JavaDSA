import java.util.Scanner;
class pracQ4
{
     public static void main(String arg[])
     {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter two nos");
          int no1=sc.nextInt();
          int no2=sc.nextInt();
          System.out.println("Enter your choice\n1.add\n2.sub\n3.mult\n4.div");
          int ch=sc.nextInt();
         switch(ch)
         {
          case 1:System.out.println("Sum= "+(no1+no2));break;
         
           case 2: System.out.println("Sub= "+(no1-no2));break;
         
          case 3:  System.out.println("Mult= "+(no1*no2));break;

          case 4: 
          if(no1==0)
          System.out.println("0 cannot be divided");
          else
          System.out.println("Division= "+(no1/no2));break;
          default:  System.out.println("invalid choice");
          }
          
     }
}