package Inheritance;

class Vehicle{
	String name = "Honda";
	int speed = 334;
	String fuelTyper = "Normal";
	 public void car01() {
		 System.out.println("Car Name = "+ name);
		 System.out.println("Car Speed = "+ speed);
		 System.out.println("Car fuel type = "+ fuelTyper);
	 }
}

class Car extends Vehicle
{
	public void info() {
		int mileage = 34339;
		System.out.println("Car Mileage = "+ mileage);
	}
}

public class VehicalHerarichy {
	
	public static  void main(String[] args)
	{
		Car ft = new Car();
		ft.car01();
		ft.info();
	}
}
