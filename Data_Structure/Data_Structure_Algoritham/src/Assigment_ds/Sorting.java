package Assigment_ds;
/*
 Data Structure and Algorithm Topic Searching and Sorting Implement the following programs in
Java using functions 
a) Insertion Sort 
b) Bubble Sort 
c) Selection Sort 
d) Linear Search 
e)Binary Search 
Q 1. Display the total number of comparisons and swapping made by each
searching/sorting function for the given input N.
 */
import java.util.Scanner;

public class Sorting 
{
	Scanner in=new Scanner(System.in);
	int a[];
	void createArray(int size)
	{
		a=new int[size];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter Element at "+i);
			a[i]=in.nextInt();
		}
	}
	
	void bubble()
	{
		int i,j,temp ,count=0,count1=0;
		for(i=0;i<a.length-1;i++)
		{
			
			for(j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					count1++;
				}
			}
			count++;
		}
		System.out.println("Total number of comparison done="+count);
		System.out.println("Total number of swapping done="+count1);
	}
	
	void insertion_sort()
	{
		int i,j,newElement,count=0,count1=0;
		for(i=0;i<a.length-1;i++)
		{
			newElement=a[i+1];
			j=i+1;
			while(j>0 && a[j-1]>newElement)
			{
				a[j]=a[j-1];
				j--;
				count++;
			}
			a[j]=newElement;
			count1++;
		}
		System.out.println("Total number of comparison done="+count);
		System.out.println("Total number of swapping done="+count1);
	}
	void selection_sort()
	{
		int i,j,min,pos,count=0,count1=0;
		for(i=0;i<a.length;i++)
		{
			min=a[i];
			pos=i;
			for(j=i+1;j<a.length;j++)
			{
				if(a[j]<min)
				{
					min=a[j];
					pos=j;
					count++;
				}
			}
			a[pos]=a[i];
			a[i]=min;
			count1++;
			
		}
		System.out.println("Total number of comparison done="+count);
		System.out.println("Total number of swapping done="+count1);
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
	void binary_Search(int start,int end,int key)
	{
		if(start<end)
		{
			int mid=(start+end)/2;
			if(a[mid]==key)
				System.out.println(key+" found at "+(mid+1));
			 
			if(key<a[mid])
				binary_Search(0,mid-1,key);
			
			if(key>a[mid])
				binary_Search(mid+1,end,key);
			
		}
		else
			System.out.println(key+" not found");
		
	}
	
	void printArray()
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter array size");
		int size=in.nextInt();
		Sorting obj=new Sorting();
		obj.createArray(size);
		
		obj.bubble();
		System.out.println("Array after Bubble sort");
		obj.printArray();
		
		obj.insertion_sort();
		System.out.println("Array after Insertion  sort");
		obj.printArray();
		
		obj.selection_sort();
		System.out.println("Array after Selection sort");
		obj.printArray();
		
		System.out.println("Enter key for linear search element");
		int key=in.nextInt();
		int res=obj.seuentialSearch(key);
		if(res==-1)
			System.out.println("key not found "+res);
		else
			System.out.println("key found at "+res +"place");
		
		
		System.out.println("Enter key for binary search  ");
		int key1=in.nextInt();
		obj.binary_Search(0, size, key1);
		
	}

}

/*
 output:-
 Enter array size
5
Enter Element at 0
45
Enter Element at 1
99
Enter Element at 2
12
Enter Element at 3
36
Enter Element at 4
1
Total number of comparison done=4
Total number of swapping done=8
Array after Bubble sort
1
12
36
45
99
Total number of comparison done=0
Total number of swapping done=4
Array after Insertion  sort
1
12
36
45
99
Total number of comparison done=0
Total number of swapping done=5
Array after Selection sort
1
12
36
45
99
Enter key for linear search element
36
key found at 2place
Enter key for binary search  
99
99 found at 5

 */
