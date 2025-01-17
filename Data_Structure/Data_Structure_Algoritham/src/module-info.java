//DHANRAJ NARAYAN SHINDE
//ROLL 23
//
//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//
//package Assigment_ds;
///*
// Data Structure and Algorithm Topic Searching and Sorting Implement the following programs in
//Java using functions 
//a) Insertion Sort 
//b) Bubble Sort 
//c) Selection Sort 
//d) Linear Search 
//e)Binary Search 
//Q 1. Display the total number of comparisons and swapping made by each
//searching/sorting function for the given input N.
// */
//import java.util.Scanner;
//
//public class Sorting 
//{
//	Scanner in=new Scanner(System.in);
//	int a[];
//	void createArray(int size)
//	{
//		a=new int[size];
//		for(int i=0;i<a.length;i++)
//		{
//			System.out.println("Enter Element at "+i);
//			a[i]=in.nextInt();
//		}
//	}
//	
//	void bubble()
//	{
//		int i,j,temp ,count=0,count1=0;
//		for(i=0;i<a.length-1;i++)
//		{
//			
//			for(j=0;j<a.length-1;j++)
//			{
//				if(a[j]>a[j+1])
//				{
//					temp=a[j];
//					a[j]=a[j+1];
//					a[j+1]=temp;
//					count1++;
//				}
//			}
//			count++;
//		}
//		System.out.println("Total number of comparison done="+count);
//		System.out.println("Total number of swapping done="+count1);
//	}
//	
//	void insertion_sort()
//	{
//		int i,j,newElement,count=0,count1=0;
//		for(i=0;i<a.length-1;i++)
//		{
//			newElement=a[i+1];
//			j=i+1;
//			while(j>0 && a[j-1]>newElement)
//			{
//				a[j]=a[j-1];
//				j--;
//				count++;
//			}
//			a[j]=newElement;
//			count1++;
//		}
//		System.out.println("Total number of comparison done="+count);
//		System.out.println("Total number of swapping done="+count1);
//	}
//	void selection_sort()
//	{
//		int i,j,min,pos,count=0,count1=0;
//		for(i=0;i<a.length;i++)
//		{
//			min=a[i];
//			pos=i;
//			for(j=i+1;j<a.length;j++)
//			{
//				if(a[j]<min)
//				{
//					min=a[j];
//					pos=j;
//					count++;
//				}
//			}
//			a[pos]=a[i];
//			a[i]=min;
//			count1++;
//			
//		}
//		System.out.println("Total number of comparison done="+count);
//		System.out.println("Total number of swapping done="+count1);
//	}
//	
//	int seuentialSearch(int key)
//	{
//		for(int i=0;i<a.length;i++)
//		{
//			if(a[i]==key)
//				return i;
//		}
//		return -1;
//		
//	}
//	void binary_Search(int start,int end,int key)
//	{
//		if(start<end)
//		{
//			int mid=(start+end)/2;
//			if(a[mid]==key)
//				System.out.println(key+" found at "+(mid+1));
//			 
//			if(key<a[mid])
//				binary_Search(0,mid-1,key);
//			
//			if(key>a[mid])
//				binary_Search(mid+1,end,key);
//			
//		}
//		else
//			System.out.println(key+" not found");
//		
//	}
//	
//	void printArray()
//	{
//		for(int i=0;i<a.length;i++)
//		{
//			System.out.println(a[i]);
//		}
//	}
//	
//
//	public static void main(String[] args) 
//	{
//		Scanner in=new Scanner(System.in);
//		System.out.println("Enter array size");
//		int size=in.nextInt();
//		Sorting obj=new Sorting();
//		obj.createArray(size);
//		
//		obj.bubble();
//		System.out.println("Array after Bubble sort");
//		obj.printArray();
//		
//		obj.insertion_sort();
//		System.out.println("Array after Insertion  sort");
//		obj.printArray();
//		
//		obj.selection_sort();
//		System.out.println("Array after Selection sort");
//		obj.printArray();
//		
//		System.out.println("Enter key for linear search element");
//		int key=in.nextInt();
//		int res=obj.seuentialSearch(key);
//		if(res==-1)
//			System.out.println("key not found "+res);
//		else
//			System.out.println("key found at "+res +"place");
//		
//		
//		System.out.println("Enter key for binary search  ");
//		int key1=in.nextInt();
//		obj.binary_Search(0, size, key1);
//		
//	}
//
//}
//
///*
// output:-
// Enter array size
//5
//Enter Element at 0
//45
//Enter Element at 1
//99
//Enter Element at 2
//12
//Enter Element at 3
//36
//Enter Element at 4
//1
//Total number of comparison done=4
//Total number of swapping done=8
//Array after Bubble sort
//1
//12
//36
//45
//99
//Total number of comparison done=0
//Total number of swapping done=4
//Array after Insertion  sort
//1
//12
//36
//45
//99
//Total number of comparison done=0
//Total number of swapping done=5
//Array after Selection sort
//1
//12
//36
//45
//99
//Enter key for linear search element
//36
//key found at 2place
//Enter key for binary search  
//99
//99 found at 5
//
// */
//
//
//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//
//import java.util.Arrays;
//
//class Student {
//    int regNo;
//    String name;
//    String branch;
//    double cgpa;
//
//    public Student(int regNo, String name, String branch, double cgpa) {
//        this.regNo = regNo;
//        this.name = name;
//        this.branch = branch;
//        this.cgpa = cgpa;
//    }
//
//    public String toString() {
//        return "Reg No.: " + regNo + "\tName: " + name + "\t\tBranch: " + branch + "\t\tCGPA: " + cgpa;
//    }
//}
//
//public class question {
//    private Student[] students;
//
//    public question() {
//        students = new Student[5];
//        students[0] = new Student(101, "Dhanraj", "Mechanical Engineering", 6.8);
//        students[1] = new Student(102, "Sagar", "Electrical Engineering", 4.5);
//        students[2] = new Student(103, "rishabh", "Computer Engineering", 7.9);
//        students[3] = new Student(104, "rohit", "Civil Engineering", 5.2);
//        students[4] = new Student(105, "Ajinkya", "Chemical Engineering", 3.7);
//    }
//
//    public Student linearSearch(int regNo) {
//        for (Student student : students) {
//            if (student.regNo == regNo) {
//                return student;
//            }
//        }
//        return null;
//    }
//
//    public void bubbleSort() {
//        int n = students.length;
//        for (int i = 0; i < n - 1; i++) {
//            for (int j = 0; j < n - i - 1; j++) {
//                if (students[j].regNo > students[j + 1].regNo) {
//                    // Swap students[j] and students[j+1]
//                    Student temp = students[j];
//                    students[j] = students[j + 1];
//                    students[j + 1] = temp;
//                }
//            }
//        }
//    }
//
//    public Student binarySearch(int regNo) {
//        int start = 0;
//        int end = students.length - 1;
//        while (start <= end) {
//            int mid = start + (end - start) / 2;
//            if (students[mid].regNo == regNo) {
//                return students[mid];
//            }
//            if (students[mid].regNo < regNo) {
//                start = mid + 1;
//            } else {
//                end = mid - 1;
//            }
//        }
//        return null;
//    }
//
//    public void insertionSortDescendingCGPA() {
//        int n = students.length;
//        for (int i = 1; i < n; ++i) {
//            Student key = students[i];
//            int j = i - 1;
//            while (j >= 0 && students[j].cgpa < key.cgpa) {
//                students[j + 1] = students[j];
//                j = j - 1;
//            }
//            students[j + 1] = key;
//        }
//    }
//
//    public static void main(String[] args) {
//    	question group = new question();
//
//        // Linear search
//        int searchRegNo = 103;
//        Student searchedStudent = group.linearSearch(searchRegNo);
//        if (searchedStudent != null) {
//            System.out.println("Linear Search Result:");
//            System.out.println(searchedStudent);
//        } else {
//            System.out.println("Student with Reg No. " + searchRegNo + " not found.");
//        }
//
//        // Bubble sort and display sorted data
//        group.bubbleSort();
//        System.out.println("\nBubble Sort Result (by Reg No.):");
//        for (Student student : group.students) {
//            System.out.println(student);
//        }
//
//        // Binary search
//        searchRegNo = 102;
//        searchedStudent = group.binarySearch(searchRegNo);
//        if (searchedStudent != null) {
//            System.out.println("\nBinary Search Result:");
//            System.out.println(searchedStudent);
//        } else {
//            System.out.println("\nStudent with Reg No. " + searchRegNo + " not found.");
//        }
//
//        // Insertion sort (descending CGPA) and display sorted data
//        group.insertionSortDescendingCGPA();
//        System.out.println("\nInsertion Sort Result (by CGPA in descending order):");
//        for (Student student : group.students) {
//            System.out.println(student);
//        }
//    }
//}
//
//output
//Linear Search Result:
//Reg No.: 103	Name: rishabh		Branch: Computer Engineering		CGPA: 7.9
//
//Bubble Sort Result (by Reg No.):
//Reg No.: 101	Name: Dhanraj		Branch: Mechanical Engineering      CGPA: 6.8
//Reg No.: 102	Name: Sagar		      Branch: Electrical Engineering	CGPA: 4.5
//Reg No.: 103	Name: rishabh		Branch: Computer Engineering		CGPA: 7.9
//Reg No.: 104	Name: rohit		      Branch: Civil Engineering		CGPA: 5.2
//Reg No.: 105	Name: Ajinkya		Branch: Chemical Engineering		CGPA: 3.7
//
//Binary Search Result:
//Reg No.: 102	Name: Sagar		Branch: Electrical Engineering		CGPA: 4.5
//
//Insertion Sort Result (by CGPA in descending order):
//Reg No.: 103	Name: rishabh	Branch: Computer Engineering		      CGPA: 7.9
//Reg No.: 101	Name: Dhanraj	Branch: Mechanical Engineering            CGPA: 6.8
//Reg No.: 104	Name: rohit		Branch: Civil Engineering		      CGPA: 5.2
//Reg No.: 102	Name: Sagar		Branch: Electrical Engineering		CGPA: 4.5
//Reg No.: 105	Name: Ajinkya	Branch: Chemical Engineering		      CGPA: 3.7
//
