package oops;

import java.util.Arrays;

class Subject
{
	private String subId;
	private String name;
	private int maxmarks;
	private int marksobtain;
	public String getSubId() {
		return subId;
	}
	
	public String getName() {
		return name;
	}
	
	public Subject(String subId, String name, int marksobtain) {
		super();
		this.subId = subId;
		this.name = name;
		this.marksobtain = marksobtain;
	}

	public Subject(String subId, String name) {
		super();
		this.subId = subId;
		this.name = name;
	}
 
	
	public String toString() {
		return "Student [subId=" + subId + ", name=" + name + ", marksobtain=" + marksobtain + "]";
	}

	public Subject(String subId, String name, int maxmarks, int marksobtain) {
		super();
		this.subId = subId;
		this.name = name;
		this.maxmarks = maxmarks;
		this.marksobtain = marksobtain;
	}

	public int getMaxmarks() {
		return maxmarks;
	}
	public void setMaxmarks(int maxmarks) {
		this.maxmarks = maxmarks;
	}
	public int getMarksobtain() {
		return marksobtain;
	}
	public void setMarksobtain(int marksobtain) {
		this.marksobtain = marksobtain;
	}
	
}
//class Student
//{
//	private String rollno;
//	private String name;
//	private Subject[] subject;
//	private String dept;
//	public String getRollno() {
//		return rollno;
//	}
//	
//	public String getName() {
//		return name;
//	}
//	
//	public Subject[] getSubject() {
//		return subject;
//	}
//	public void setSubject(Subject... subject) {
//		this.subject = subject;
//	}
//	public String getDept() {
//		return dept;
//	}
//	public void setDept(String dept) {
//		this.dept = dept;
//	}
//
//	
////	public String toString() {
////		return "Student [rollno=" + rollno + ", name=" + name + ", subject=" + Arrays.toString(subject) + ", dept="
////				+ dept + "]";
////	}
//
////	public Student(String rollno, String name, Subject[] subject, String dept) {
////		super();
////		this.rollno = rollno;
////		this.name = name;
////		this.subject = subject;
////		this.dept = dept;
////	}
//	
//}
public class StuCha2 {

	public static void main(String[] args) {
		
		Subject subs[]=new Subject[3];
		subs[0]=new Subject("101","DS",100);
		subs[1]=new Subject("102","Algo",100);
		subs[2]=new Subject("103","cs",100);
		
		for (Subject subject : subs) {
			System.out.println(subject);
		}
	}

}
