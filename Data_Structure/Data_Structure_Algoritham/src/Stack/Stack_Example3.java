package Stack;

import java.util.Scanner;

public class Stack_Example3 
{
	private int arr[],tos,maxSize;
	 void createStack(int size)
	 {
		 maxSize=size;
		 tos=-1;
		 arr=new int[maxSize];
	 }
	 void push(int e)
	 {
		 tos++;
		 arr[tos]=e;
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
		 temp=arr[tos];
		 tos--;
		 return temp;
	 }
	 boolean isempty()
	 {
		 if(tos==-1)
			 return true;
		 else
			 return false;
	 }
	 
	 void Decimal_To_Binary(int data)
	 {
		 while(data>0)
		 {
			 push(data%2);
			 data=data/2;
		 }
	 }
	 
	 void printStack()
	 {
		 for(int i=tos;i>=0;i--)
			 System.out.println(arr[i]);
	 }
	 
	 public static void main(String args[])
	 {
		 Scanner in=new Scanner(System.in); 
		 System.out.println("Enter Decimal Number");
		 int no=in.nextInt();
		 System.out.println("Enter size");
		 int size=in.nextInt();
		 Stack_Example3 obj=new Stack_Example3();
		 obj.createStack(size);
		 
		 System.out.println("Elements in the stack");
		 obj.Decimal_To_Binary(no);
		 
		 System.out.println("Decimal to binary Conversion:");
		 obj.printStack();
	 }
}
