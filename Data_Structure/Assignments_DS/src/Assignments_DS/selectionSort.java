package Assignments_DS;
import java.util.Scanner;
public class selectionSort 
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
	void selection_sort()
	{
		
		int i,j,min,pos;
		for(i=0;i<a.length-1;i++)
		{
			min=a[i];
			pos=i;
			for(j=i+1;j<a.length;j++)
			{
				if(a[j]<min)
				{
					min=a[j];
					pos=j;
				}
			}
			a[pos]=a[i];
			a[i]=min;
		}
	}
	
	void printArray()
	{
		for(int i=0;i<a.length;i++)
			System.out.println("a["+i+"]="+a[i]);
	}

	public static void main(String[] args) 
	{
		selectionSort obj=new selectionSort ();
		obj.arrayCreation();
		System.out.println("Array before sort");
		obj.printArray();
		
		System.out.println("Array after sort");
		obj.selection_sort();
		obj.printArray();

	}

}
