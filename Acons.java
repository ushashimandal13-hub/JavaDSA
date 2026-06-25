class A{
	int a,b;
	A(int a, int b){
	a=a;
	b=b;
	}
	void show(){
	System.out.println(a+" "+b);
	}
	public static void main(String[]args){
	A a1 = new A(4,8);
	a1.show();
	}
	}