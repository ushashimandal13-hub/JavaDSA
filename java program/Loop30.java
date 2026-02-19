/*
5 4 3 2 *
5 4 3 * 1
5 4 * 2 1
5 * 3 2 1
* 4 3 2 1
*/
class Loop29{
public static void main(String[]args){
int i,j;
for(i = 1 ; i<=5 ; i++)
{
	for (j=5 ; j<=1 ; j--)
	{
	if(j==i)
		System.out.print("* ");	
	else
		System.out.println(j+" ");
	}
	}
	System.out.println();
	}
}