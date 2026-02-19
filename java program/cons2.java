class Employee{
	int id;
	String name;
	Employee(String name, int id){
		this.id=id;
		this.name= name;
	}
	Employee (Employee s){
		this.id = s.id;
		this.name = s.name;
	}
	void display(){
		System.out.println("Employee name: " +name+ " id: "+id);
	}
}
class cons2{
	public static void main(String[]args){
    Employee s1 = new Employee("Ushashi",2511);
    s1.display();
	}
}
