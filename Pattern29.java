class Pattern29{
public static void main(String[]args){
	int i,j;
	for(i=1 ; i<=4 ; i++){

for(j=1; j<=i; j++){
	System.out.print(j+"\t");
}
for(j=i ; j>=1 ; j--){
	System.out.print(j+"\t");
}
System.out.println();
}
}
}