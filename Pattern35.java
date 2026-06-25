/*
1234
 123
  12
   1
   1
  12
 123
1234
*/
class Pattern35{
public static void main(String[]args){
	int i,j;
	for(i=4 ; i>=1 ; i--){

for(j=4-i; j>=1; j--){
	System.out.print(" ");
}
for(j=1 ; j<=i ; j++){
	System.out.print(j);
}
System.out.println();
}
	for(i=1 ; i<=4 ; i++){

for(j=4-i; j>=1; j--){
	System.out.print(" ");
}
for(j=1 ; j<=i ; j++){
	System.out.print(j);
}
System.out.println();
}
}
}