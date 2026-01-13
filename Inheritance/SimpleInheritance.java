package Inheritance;

class Person{
	String name;
	int age;
	public void person1(String name, int age) {
		this.name = name;
		System.out.println("Name: "+ this.name);
		this.age = age;
		System.out.println("Age: "+this.age);
	}
}
class Student extends Person
{
	int Rollno;
	int Marks;
	public void marks(int Rollno, int Marks) {
		
		this.Rollno = Rollno;
		System.out.println("Roll no: "+this.Rollno);
		this.Marks = Marks;
		System.out.println("Marks : "+ Marks);
	}
}




public class SimpleInheritance {
	
	public static void main(String[] args) {
		
		Student sf = new Student();
		sf.person1("Dnyanesh", 21);
		sf.marks(01, 89);
		
		
	}

}
