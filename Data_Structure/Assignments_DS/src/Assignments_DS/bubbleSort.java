package Assignments_DS;

import java.util.Scanner;

public class bubbleSort 
{
	Scanner in=new Scanner(System.in);
	int a[];
	void arrayCreation()
	{
		System.out.println("Enter size of an array");
		int size=in.nextInt();
		a=new int[size];
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter array element at "+i);
			a[i]=in.nextInt();
		}
	
	}
	
	void bubble_Sort()
	{
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}
	
	void printArray()
	{
		for(int i=0;i<a.length;i++)
			System.out.println("a["+i+"]="+a[i]);
	}

	public static void main(String[] args)
	{
		bubbleSort obj=new bubbleSort();
		obj.arrayCreation();
		obj.bubble_Sort();
		
		System.out.println("Array after sort");
		obj.printArray();
	}

}
