package Assignments_DS;

import java.util.Scanner;

public class Stack 
{
	int tos,stack[],maxsize;
	void createStack(int size)
	{
		maxsize=size;
		tos=-1;
		stack=new int[maxsize];
	}
	
	void push(int e)
	{
		tos++;
		stack[tos]=e;
	}
	boolean isFull()
	{
		if(tos==maxsize-1)
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
	int peek()
	{
		return stack[tos]; 
	}
	
	void printStack()
	{
		for(int i=tos;i>-1;i--)
			System.out.println(stack[i]);
	}
	

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		int size,e,choice;
		System.out.println("Enter size of the queue");
		size=in.nextInt();
		Stack obj=new Stack();
		obj.createStack(size);
		
		do
		{
			System.out.println("Enter \n1.push \n2.pop \n3.peek \n4.print Stack \n0.Exit ");
			choice=in.nextInt();
			switch(choice)
			{
			case 1:
				if(obj.isFull()!=true)
				{
					System.out.println("Enter element at stack");
					e=in.nextInt();
					obj.push(e);
				}
				else
					System.out.println("Stack is full");
				break;
			case 2:
				if(obj.isEmpty()!=true)
				{
					e=obj.pop();
					System.out.println("Poped element is "+e);
				}
				else
					System.out.println("Stack is empty");
				break;
				
			case 3:
				if(obj.isEmpty()!=true)
				{
					e=obj.peek();
					System.out.println("Peeked element "+e);
				}
				else
					System.out.println("Stack is empty");
				break;
			case 4:
				if(obj.isEmpty()!=true)
				{
					System.out.println("Elements in stack");
					obj.printStack();
				}
				else
					System.out.println("Stack is empty");
				break;
			default:
				System.out.println("wrong choice");
				break;
			case 0:
				System.out.println("Exiting...");
				break;
			}
		}while(choice!=0);
		

	}

}
