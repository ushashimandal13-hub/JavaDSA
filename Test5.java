


import java.util.Scanner;
class Test5
{
     public static void main(String arg[])
     {
          Scanner sc=new Scanner(System.in);
          System.out.println("enter a basic sal ");
          double sal=sc.nextDouble();
          double da=0,hra=0,total=0;
         switch((int)sal/1000)
         {
          case 0:case 1:case 2:da=sal*0.05;hra=sal*0.07;break;
         case 3: case 4: da=sal*0.1;hra=sal*0.05;break;
         case 5: case 6:case 7:da=sal*0.2;hra=sal*0.1;break;
         default :
         da=sal*0.3;
         hra=sal*0.2;
          }
          total=sal+da+hra;
          System.out.println("basic sal="+sal);
           System.out.println("da="+da);
            System.out.println("hra="+hra);
             System.out.println("total sal="+total);
          
     }
}