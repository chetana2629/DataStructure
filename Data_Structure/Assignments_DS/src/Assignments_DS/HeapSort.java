package Assignments_DS;

import java.util.Scanner;

public class HeapSort 
{
	Scanner in=new Scanner(System.in);
	int a[];
	void createArray()
	{
		System.out.println("Enter size of an array");
		int size=in.nextInt();
		a=new int[size];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("enter array element at "+i+":");
			a[i]=in.nextInt();
		}
	}
	
	void heap_sort()
	{
		int i,k,temp,lp,done;
		for(i=a.length-1;i>=0;i--)
		{
			for(k=0;k<=i;k++)
			{
				lp=k;
				done=0;
				while(lp>0 && done!=1)
				{
					if(a[lp]>a[lp/2])
					{
						temp=a[lp];
						a[lp]=a[lp/2];
						a[lp/2]=temp;
						
						lp=lp/2;
					}
					else 
						done=1;
				}
				temp=a[0];
				a[0]=a[i];
				a[i]=temp;
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
		HeapSort obj=new HeapSort();
		obj.createArray();
		System.out.println("Array before sorting");
		obj.printArray();
		
		obj.heap_sort();
		System.out.println("Array after Heap sort");
		obj.printArray();
	}

}
