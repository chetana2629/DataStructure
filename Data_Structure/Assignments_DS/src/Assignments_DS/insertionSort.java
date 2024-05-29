package Assignments_DS;

import java.util.Scanner;

public class insertionSort 
{
	Scanner in=new Scanner(System.in);
	int a[];
	void arrayCreation()
	{
		int size;
		System.out.println("Enter array size");
		size=in.nextInt();
		
		a=new int[size];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter array element at "+i);
			a[i]=in.nextInt();
		}
	}
	
	void insertion_sort()
	{
		int i,j,newElement;
		for(i=0;i<a.length-1;i++)
		{
			newElement=a[i+1];
			j=i+1;
			while(j>0 && a[j-1]>newElement)
			{
				a[j]=a[j-1];
				j--;
			}
			a[j]=newElement;
		}
	}
	
	public void printArray()
	{
		for(int i=0;i<a.length;i++)
			System.out.println("a["+i+"]="+a[i]);
	}

	public static void main(String[] args) 
	{
		insertionSort obj=new insertionSort();
		obj.arrayCreation();
		System.out.println("Array before sort");
		obj.printArray();
		
		obj.insertion_sort();
		System.out.println("Array after selection sort");
		obj.printArray();

	}

}
