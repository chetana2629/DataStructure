package Assignments_DS;

import java.util.Scanner;

public class QuickSort 
{
	Scanner in=new Scanner(System.in);
	int a[];
	void createArray(int size)
	{
		a=new int[size];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter element at "+i+":");
			a[i]=in.nextInt();
		}
	}
	void quick_sort(int start,int end)
	{
		int i,j,pivot,temp;
		i=start;
		j=end;
		pivot=start;
		while(i<j)
		{
			while(a[i]<a[pivot])
				i++;
			while(a[j]>a[pivot])
				j--;
			if(i<j)
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
			
		}
		if(i<end)
			quick_sort(i+1, end);
		if(j>start)
			quick_sort(start,j-1);
		
	}
	
	void printArray()
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.println("a["+i+"]="+a[i]);
		}
	}
	

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter array size");
		int size=in.nextInt();
		
		QuickSort obj=new QuickSort();
		obj.createArray(size);
		System.out.println("Array before sorting");
		obj.printArray();
		
		obj.quick_sort(0, size-1);
		//when size-1 is not given then it will throw array out bound exception.
		System.out.println("Array after quick sort");
		obj.printArray();

	}

}
