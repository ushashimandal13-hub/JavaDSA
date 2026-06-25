class Pattern41{
public static void main(String[]args){
	/*int i,j,c=0;
for(i=1;i<=4;i++)
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
}*/
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
        c=c+1;
     System.out.println();
} 
c=c-2; 
for(i=1;i<=4;i++)
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
        c=c-2;
     System.out.println();
}  
}
}