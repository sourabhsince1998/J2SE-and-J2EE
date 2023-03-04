package Encapsulation;

public class Student 
{
	private int stuId;
	private String name;
	private long ph;
	private char grade;
	public Student(int stuId, String name, long ph, char grade) {
		super();
		this.stuId = stuId;
		this.name = name;
		this.ph = ph;
		this.grade = grade;
	}
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPh() {
		return ph;
	}
	public void setPh(long ph) {
		this.ph = ph;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", name=" + name + ", ph=" + ph + ", grade=" + grade + "]";
	}
	
	
	

}
