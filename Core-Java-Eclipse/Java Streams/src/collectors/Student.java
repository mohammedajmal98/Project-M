package collectors;

public class Student {
	
	private int rollNo;
	private String name;
	private String subject;
	private int marks;
	private String grade;
	public Student(int rollNo, String name, String subject, int marks, String grade) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.subject = subject;
		this.marks = marks;
		this.grade = grade;
	}
	
	public int getRollNo() {
		return rollNo;
	}
	public String getName() {
		return name;
	}
	public String getSubject() {
		return subject;
	}
	public int getMarks() {
		return marks;
	}
	public String getGrade() {
		return grade;
	}
	
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", subject=" + subject + ", marks=" + marks + ", grade="
				+ grade + "]";
	}
	
	
	
	
	
	

}
