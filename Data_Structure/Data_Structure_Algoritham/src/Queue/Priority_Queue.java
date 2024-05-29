package Queue;

import java.util.Scanner;

public class Priority_Queue 
{
	private int  maxSize,queue[],rear,front;
	
	void createQueue(int size)
	{
		maxSize=size;
		rear=-1;
		front=0;
		queue=new int [size];
	}
	
	void Enqueue(int element)
	{
		rear++;
		queue[rear]=element;
	}
	boolean isFull()
	{
		if(rear==maxSize-1)
			return true;
		else
			return false;
	}
	int Dequeue() 
	{
		int temp;
		temp=queue[front];
		front++;
		return temp;
	}
	boolean isEmpty()
	{
		if(rear==-1)
			return true;
		else
			return false;
	}
	
	void printQueue()
	{
		for(int i=front;i<rear;i++)
		{
			System.out.println(queue[i]);
		}
	}
	

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		int size,e,choice;
		System.out.println("Enter size of Queue");
		size=in.nextInt();
		
		Priority_Queue obj=new Priority_Queue();
		obj.createQueue(size);
		
		do
		{
			System.out.println("Enter \n1.Queue \n2.Dequeue \n3.printQueue \n0.Exit");
			choice=in.nextInt();
			switch(choice)
			{
			case 1:
				if(obj.isFull()!=true)
				{
					System.out.println("Enter element in the queue");
					e=in.nextInt();
					obj.Enqueue(e);
				}
				else
					System.out.println("Queue full");
				break;
			case 2:
				if(obj.isEmpty()!=true)
				{
					e=obj.Dequeue();
					System.out.println("Dequeued element "+e);
				}
				else
					System.out.println("Empty Queued");
				break;
			case 3:
				if(obj.isEmpty()!=true)
				{
					System.out.println("Elements in the Queue");
					obj.printQueue();
				}
				else
					System.out.println("Empty Queue");
				break;
				default :
					System.out.println("Wrong Choice");
					break;
				case 0:
					System.out.println("Exit...");
			}
		}while(choice!=0);

	}

}
