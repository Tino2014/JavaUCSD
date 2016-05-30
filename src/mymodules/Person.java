package mymodules;

public class Person {
	private String name;
	
	public Person(String n) {
		this.name = n;
		System.out.print("#1 ");
	}
	
	public String getName() {
		return this.name;
	}
}
