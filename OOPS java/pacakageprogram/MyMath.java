package pk;
public class MyMath{
	int n1,n2;
	public MyMath(int n1, int n2){
	this.n1=n1;
	this.n2=n2;

	}
	public void add(){
	System.out.println("Sum="+(n1+n2));
	}
	public int sub(){
	return n1-n2;
	}
}