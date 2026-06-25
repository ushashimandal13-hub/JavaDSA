class Pattern40{
public static void main(String[]args){
	int i,j,c=0;
for(i=4;i>=1;i--)
{
    for(j=1;j<=i;j++)
    {
        System.out.print(j);
    }
        for(j=1 ; j<=c ; j++){
     	System.out.print(" ");
     }
   for(j=i;j>=1;j--){
        System.out.print(j);
    }
        c=c+2;
     System.out.println();
}  
}
}