package Assignments_DS;

import java.util.Scanner;

public class mergesort
{
	Scanner in=new Scanner(System.in);
	int a[];
	void arrayCreate(int n)
	{
		a=new int[n];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter array element at "+i);
			a[i]=in.nextInt();
		}
	}
	void merge(int start,int end)
	{
		if(start<end)
		{
			int mid=(start+end)/2;
			merge(start,mid);
			merge(mid+1,end);
			merger(start,mid,end);
		}
	}
	
	void merger(int start,int mid,int end)
	{
		int temp[]=new int[a.length];
		int i,j,index;
		i=index=start;
		j=mid+1;
		while(i<=mid&&j<=end)
		{
			if(a[i]<a[j])
				temp[index++]=a[i++];
			else
				temp[index++]=a[j++];
		}
		while(i<=mid)
			temp[index++]=a[i++];
		while(j<=end)
			temp[index++]=a[j++];
		
		for( i=start;i<=end;i++)
			a[i]=temp[i];
	}
	
	void printArray()
	{
		for(int i=0;i<a.length;i++)
			System.out.println("a["+i+"]="+a[i]);
	}

	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int size;
		System.out.println("Enter size of an array");
		size=in.nextInt();
		
		mergesort obj=new mergesort();
		obj.arrayCreate(size);
		
		System.out.println("Array before sort");
		obj.printArray();
		
		obj.merge(0, size-1);
		System.out.println("Array after merge Sort");
		obj.printArray();
	}
}
