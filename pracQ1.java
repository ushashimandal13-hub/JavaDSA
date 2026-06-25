import java.util.Scanner;
class Q1{
     public static void main(String arg[])
     {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter a salary ");
         double sal=sc.nextDouble();
         double da,hra,total;
         da=sal*0.1;
         hra=sal*0.2;
         total=sal+da+hra;
         
         System.out.println("da="+da);
         System.out.println("hra="+hra);
         System.out.println("total="+total);

     }
}

