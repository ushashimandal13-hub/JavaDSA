import java.util.Scanner;
class Sw2
{
     public static void main(String arg[])
     {
          Scanner sc=new Scanner(System.in);
        
          System.out.println("enter your choice\n1.square\n2.rectangle\n3.circle");
          int ch=sc.nextInt();
         switch(ch)
         {
          case 1:
          System.out.println("enter square  side ");
          int s=sc.nextInt();
          System.out.println("area of square="+(s*s));
          break;
         
           case 2: System.out.println(" Enter rectangle length and width ");
           int l =sc.nextInt();
           int w =sc.nextInt();
         System.out.println(" Area of rectangle = "+ (w*l)); 
         break;
          case 3:  System.out.println(" Enter radius of circle");
               int r = sc.nextInt();
               System.out.println(" Area of circle"+ (Math.PI * r*r));
         break;
          default:  System.out.println("invalid choice");
          }
          
     }
}