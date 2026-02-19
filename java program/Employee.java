class Employee{
    String name;
	int id;
	double salary;
	int age;
	String resignation;
}
class Opp1{
	public static void main(String args[]){
	 Employee e = new Employee();
	 e.name="Enakshi";
	 e.age=35;
	 e.id=65456;
	 e.salary=45000;
	 e.resignation= "HR";
	 System.out.println("Employee name= "+e.name);
	  System.out.println("Age= "+e.age);  
	   System.out.println("ID "+e.id);
	   System.out.println("Salary= "+e.salary);
	   System.out.println("Resignation- "+e.resignation);
	}
	}
