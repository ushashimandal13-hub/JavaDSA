class Loop6{
	
public static void main(String[]args){

int i;
i=1;
while (i<=5)
{
	System.out.println("A");
	i++;
	if(i>=3)
	{
		break;
    }
	System.out.println("B");
}
	System.out.println("C");
    System.out.println(i);
}	
}