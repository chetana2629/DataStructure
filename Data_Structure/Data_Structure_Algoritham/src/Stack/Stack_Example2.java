package Stack;

import java.util.Scanner;

public class Stack_Example2 
{
	private int maxSize,tos;
	private char arr[];
	
	void createStack(int size)
	{
		maxSize=size;
		tos=-1;
		arr=new char[size];
	}
	
	void push(char ch)
	{
		tos++;
		arr[tos]=ch;
		
	}
	
	boolean isFull()
	{
		if(tos==maxSize-1)
			return true;
		else
			return false;
	}
	
	int pop()
	{
		char temp;
		temp=arr[tos];
		tos--;
		return temp;
	}
	
	boolean isEmpty()
	{
		if(tos==-1)
			return true;
		else
			return false;
	}
	
	void printStack()
	{
		for(int i=tos;i>=0;i--)
			System.out.println(arr[i]);
	}

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		String str;
		System.out.println("enter String:");
		str=in.next();
		int size=str.length();

		
		Stack_Example2 obj=new Stack_Example2();
		obj.createStack(size);
		int choice;
		do
		{
			System.out.println("Enter 1.push \n2.pop \n3.printstack \n0.Exit");
			choice=in.nextInt();
			switch(choice)
			{
			case 1:
				if(obj.isFull()!=true)
				{
					for(int i=0;i<size;i++)
					{
						char ch=str.charAt(i);
						obj.push(ch);
					}
					
				}
				else
					System.out.println("Stack Full");
				break;
			case 2:
				if(obj.isEmpty()!=true)
				{
					for(int i=0;i<size;i++)
					{
						char ch= (char) obj.pop();
						System.out.print(ch);
					}
				}
				else
					System.out.println("Stack is Empty");
				break;
			
			case 3:
				if(obj.isEmpty()!=true)
				{
					System.out.println("Stack Elements are:");
					obj.printStack();
				}
				else
					System.out.println("Stack is Empty");
				break;
			default:
				System.out.println("Wrong choice");
				break;
			case 0:
				System.out.println("Exiting...");
				break;
				
			}
		}while(choice!=0);
	}

}
