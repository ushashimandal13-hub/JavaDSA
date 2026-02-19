import java.util.*;
public class Test6{
	public static void main (String args[]){
Scanner sc= new Scanner(System.in);
//wap take char form keyboad check char is alp  or not.if alp check it is upper or lower then check vowel or consonent.//
System.out.println("Enter a character :");
char ch = sc.next().charAt(0);
if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z'))
{
	if(ch>='A'&& ch<='Z')
		System.out.println("Upper case");
	else
	System.out.println("Lower case");

switch(ch)
{                 case'A': case'a': 
                  case'E': case'e': 
                  case'I': case'i': 
                  case'O': case'o': 
                  case'U': case'u':
System.out.println("Vowel");break;
default:System.out.println("Consonent");
}
}else {
	System.out.println("Not an alphabet");
}


	}


}