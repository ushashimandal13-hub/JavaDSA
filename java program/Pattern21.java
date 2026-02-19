/*
1
0       0
1       1       1
0       0       0       0
*/
class Pattern21{
public static void main(String[]args){
int i,j;
for(i = 1 ; i<=4 ; i++)
{
	for (j=1 ; j<=i ; j++)
	{
		if(i%2==0)
		System.out.print("0\t");
	else
	System.out.print("1\t");
	}
	System.out.println();
}
}
}