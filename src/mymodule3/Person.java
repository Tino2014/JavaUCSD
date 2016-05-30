package mymodule3;

public class Person {
	private String name;
	
	public Person(String n) {
		this.name = n;
	}
	
	public String toString() {
		return this.getName();
	}
	
	public String getName() {
		return this.name;
	}
}
