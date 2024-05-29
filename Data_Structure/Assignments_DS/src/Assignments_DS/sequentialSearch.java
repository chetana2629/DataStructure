package Assignments_DS;

import java.util.Scanner;

public class sequentialSearch 
{
	int a[];
	void arrayCreation()
	{
		Scanner in=new Scanner(System.in);
		int size;
		System.out.println("Enter Size of an array");
		size=in.nextInt();
		a=new int[size];
		
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter element at:"+i);
			a[i]=in.nextInt();
		}
	}
	int seuentialSearch(int key)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==key)
				return i;
		}
		return -1;
		
	}

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		
		sequentialSearch obj=new sequentialSearch ();
		obj.arrayCreation();
		System.out.println("Enter key to found");
		int key=in.nextInt();
		
		int res=obj.seuentialSearch(key);
		if(res==-1)
			System.out.println(key+"  not found");
		else
			System.out.println(key+" is found at "+res);
	}

}
