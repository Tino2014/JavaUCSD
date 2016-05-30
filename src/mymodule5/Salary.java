package mymodule5;

public class Salary extends Employee {
	private double salary; // Annual Salary
	public Salary(String name, String address, int number, double salary) {
		super(name, address, number);
		setSalary(salary);
	}
	public void setSalary(double newSalary) {
		if(newSalary >= 0.0 ) {
			salary = newSalary;
		} else {
			System.out.println("Can't initialize the salary, please give a double number no less than 0.0");
		}
	}
	
	public void mailCheck() {
		System.out.println("Within mailCheck of Salary class ");
		System.out.println("Mailing check to " + getName() + " with salary " + salary);
		
	}
	public double getSalary() {
		return salary;
	}
	public double computePay() {
		System.out.println("Computing salary pay for " + getName());
		return salary/52;
	}
 }
