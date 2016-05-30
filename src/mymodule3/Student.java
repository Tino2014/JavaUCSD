package mymodule3;

public class Student extends Person {
	private int studentID;
	
	public Student(String m, int n) {
		super(m);
		this.studentID = n;
	}
	
	public int getSID() {
		return this.studentID;
	}
	
	public String toString() {
		// TODO: what's difference here? this.getName() and super.toString();
		//return this.getSID() + ": " + this.getName();
		return this.getSID() + ": " + super.toString();
	}
	
	public static void main(String[] args) {
		//Student p = new Student("Cara", 1234);
		Person p = new Student("Cara", 1234);
		// it will still print out the Student method.
		System.out.println(p);
		//System.out.println(p.getSID());
	}
}
