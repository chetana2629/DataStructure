package Stack;

import java.util.Scanner;

public class Stack_Example1 
{
	private int stack[],tos,maxSize;
	void createStack(int size)
	{
		maxSize=size;
		tos=-1;
		stack=new int [maxSize];
	}
	void push(int e)
	{
		tos++;
		stack[tos]=e;
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
		int temp;
		temp=stack[tos];
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
	int peak()
	{
		return stack[tos];
	}
	void printStack()
	{
		for(int i=tos;i>=0;i--)
		{
			System.out.println(stack[i]);
		}
	}

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		int size,e,ch;
		System.out.println("Enter size of the stack");
		size=in.nextInt();
		
		Stack_Example1 obj=new Stack_Example1();
		obj.createStack(size);
		
		do
		{
			System.out.println("Enter 1.push \n2.pop \n3.peak \n4.printstack \n0.Exit");
			ch=in.nextInt();
			switch(ch)
			{
			case 1:
				if(obj.isFull()!=true)
				{
					System.out.println("Enter elements in the Stack");
					e=in.nextInt();
					obj.push(e);
				}
				else
					System.out.println("Stack Full");
				break;
			case 2:
				if(obj.isEmpty()!=true)
				{
					e=obj.pop();
					System.out.println(e +" is popped out");
				}
				else
					System.out.println("Stack is Empty");
				break;
			case 3:
				if(obj.isEmpty()!=true)
				{
					e=obj.peak();
					System.out.println("Peaked element in the stack is:"+e);
				}
				else
					System.out.println("Stack is Empty");
				break;
			case 4:
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
		}while(ch!=0);
	}

}
