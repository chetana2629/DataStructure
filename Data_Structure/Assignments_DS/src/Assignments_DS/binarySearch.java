package Assignments_DS;
import java.util.Scanner;
public class binarySearch
{
	Scanner in =new Scanner(System.in);
	int a[];
	void arrayCreation(int n)
	{
		a=new int[n];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("enter element at "+i+":");
			a[i]=in.nextInt();
		}
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

	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int size,key;
		System.out.println("Enter the array size");
		size=in.nextInt();
		
		binarySearch obj=new binarySearch();
		
		obj.arrayCreation(size);
		
		System.out.println("Enter key for search");
		key=in.nextInt();
		
		obj.binary_Search(0, size-1, key);
		

	}

}
