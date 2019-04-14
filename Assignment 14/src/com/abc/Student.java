package com.abc;

public class Student {

	private int studentRollno;
	private String studentName;
	private String studentBranch;
	
	public int getStudentRollno() {
		return studentRollno;
	}
	public void setStudentRollno(int studentRollno) {
		this.studentRollno = studentRollno;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentBranch() {
		return studentBranch;
	}
	public void setStudentBranch(String studentBranch) {
		this.studentBranch = studentBranch;
	}
	@Override
	public String toString() {
		return "Student [studentRollno=" + studentRollno + ", studentName=" + studentName + ", studentBranch="
				+ studentBranch + "]";
	}
	
	
}
