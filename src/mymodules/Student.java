package mymodules;

public class Student extends Person {
	private int id;
	
	public Student() {
		this("Student");
		System.out.print("#2 ");
	}
	
	public Student(String n) {
		super(n);
		System.out.print("#3 ");
	}
	public int getID() {
		return this.id;
	}
}
