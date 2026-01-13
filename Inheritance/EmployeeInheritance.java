package Inheritance;

class Employee{
	// we need to add here the id and salary
	int id;
    float salary;
	public void emp01(int id, float salary) {
		
		this.id = id;
		System.out.println("Employee Id : " + id);
		this.salary = salary;
		System.out.println("Salary : " + salary);
		
	}
}

class Manager extends Employee
{
	String Department;
	int bonus;
	public void bonus(String Department, int bonus) {
		this.Department = Department;
		System.out.println("Department : "+ Department);
		this.bonus = bonus;
		System.out.println("Bonus : "+ bonus);
	}
}




public class EmployeeInheritance {
	
	public static void main(String[] args) {
		Manager fi = new Manager();
		fi.emp01(01,35000.23f);
		fi.bonus("Developer", 5000);
	}

}
