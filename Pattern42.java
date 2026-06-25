class Pattern42{
public static void main(String[]args){
    int i,j,c=6;
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