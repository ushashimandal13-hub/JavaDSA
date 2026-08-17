====Normal class implementing Interface===============
interface I{
	void show();
}

class A implements I{
	public void show(){
		System.out.println("Showw");
	}
}

class Test4{
	public static void main(String[] args){
		I ob = new A();
		ob.show();
	}
}
============== Anonymous Inner class concept===================
interface I{
	void show();
}

class Test4{
	public static void main(String[] args){
		I ob = new A(){
			public void show(){
				System.out.println("Show method");
			}
		};
		ob.show();
	}
}

===============using Lambda Function======================
interface I{
	void show();
}

class Test4{
	public static void main(String[] args){
		I ob = () -> System.out.println("Show Lambda");
		ob.show();
	}
}

=========Static Method reference=============

interface I{
	void show();
}

class A{
	static void show(){
		System.out.println("Show method2");
	}
}
class Test4{
	public static void main(String[] args){
		I ob = A::show;
		ob.show();
	}
}

=========non-static method reference============

interface I{
	void show();
}

class A{
	void disp(){
		System.out.println("Show method3");
	}
}
class Test4{
	public static void main(String[] args){
		I ob = new A()::disp;
		ob.show();
	}
}



===============using Constructor==============

interface I{
	void show();
}

class A{

	A(){
		System.out.println("Constructor show method");
	}
}
class Test4{
	public static void main(String[] args){
		I ob = A::new;
		ob.show();
	}
}

=============user defined Consumer Interace====

import java.util.function.*;
import java.util.*;

class Test4 {

    static void myForEach(Integer arr[], Consumer<Integer> c) {

        for (Integer a : arr) {
            c.accept(a);
        }
    }

    public static void main(String[] args) {

        Integer arr[] = {10, 20, 30, 40};
        // ArrayList<Integer> a = new ArrayList<>();
        // a.add(10);
        // a.add(20);
        // a.add(30);
        // a.forEach(System.out::println);

        myForEach(arr,System.out::println);
    }
}

==========Method overloading concept/Method Reference=========

interface I{
	void show(double a);
}

class A{
	void disp(){
		System.out.println("Show method3");
	}



	void disp(int a){
		System.out.println("Show Method look");
	}

	void disp(Object a){
		System.out.println("Show Method Every");
	}
}
class Test4{
	public static void main(String[] args){
		I ob = new A()::disp;
		ob.show(5.0);
	}
}

===============using Consumer Interface 

import java.util.function.*;
import java.util.*;

class Test {

    // static void myForEach(Integer arr[], Consumer<Integer> c) {

    //     for (Integer a : arr) {
    //         c.accept(a);
    //     }
    // }

    public static void main(String[] args) {

        // Integer arr[] = {10, 20, 30, 40};
        ArrayList<Integer> a = new ArrayList<>();
        a.add(10);
        a.add(20);
        a.add(30);
        a.forEach(x -> System.out.println(x+5));

        // forEach(arr, x -> System.out.println(x));
    }
}

//Vector: https://chatgpt.com/share/6a7f4abc-9c58-83ee-804a-03be6a4a013b
//List : https://chatgpt.com/share/6a7f4ad0-8b08-83e8-bad8-8881ef89c94a
//ArrayList: https://chatgpt.com/share/6a7f4ae5-0e38-83ee-9634-7e453fe73daf