package Assigment_ds;

import java.util.Scanner;

/*
 Q 2. Create a class for a group of 50 students
holding data for their Registration no., Name, Branch, CGPA 
a) Call linear search function to display data of student with a particular Registration no.. 
b) Call bubble sort function to arrange data of students according to Registration no. 
c) Apply binary search on the above output (part b) to display data of a student with a particular Registration no. 
d) Use and modify Insertion sort logic to arrange data of students in descending order of CGPA.
 */
class student_Info
{
	Scanner in=new Scanner(System.in);
	
	private
	int reg_No;
	String name;
	String branch;
	float cgpa;
	
	void getData()
	{
		System.out.println("Enter registration no:");
		reg_No=in.nextInt();
		System.out.println("Enter Name of the student :");
		name=in.next();
		System.out.println("Enter branch name of the student ");
		branch=in.next();
		System.out.println("Enter cgpa of the student :");
		cgpa=in.nextFloat();
	}
	
	void setData()
	{
		System.out.println("Registration No="+reg_No);
		System.out.println("Student Name="+name);
		System.out.println("Branch="+branch);
		System.out.println("CGPA="+cgpa);
	}
	
}
public class Student 
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter size of an array");
		int size=in.nextInt();
		
		student_Info obj=new student_Info();
		

	}

}
