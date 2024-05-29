package LinkedList;

import java.util.Scanner;

public class Dynamic_Queue 
{
 Node front,rear;   
  void createQueue()
  {
     front= rear =null;
  }
  void dequeue()
  {
      if(rear==null)
    	  System.out.println("Empty Queue");
      else
      {
         Node t=front;
         front=front.next;
          System.out.println(t.data+"dequeue");
      }
  }
  void enqueue(int e)
  {
	  Node n=new Node(e);
      if(rear==null)
    	  front=rear=n;
          
      else
      {
         rear.next=n;
         rear=n;
          System.out.println("Enqueued");
      }
  }
  
  
  void printQueue()
  {   if(front==null)
          System.out.println("Empty list");
      else
      {   Node t=front;//1
          while(t !=null)//2
          {
              System.out.print(t.data+"|->");
              t=t.next;
          }
      }
  } 
  public static void main(String[]args)
  {
	  Scanner in=new Scanner(System.in);
	  int ch,e;
	  
	  Dynamic_Queue obj=new Dynamic_Queue();
	  
	  do
	  {
		  System.out.println("Enter \n 1.Enqueue \n2.Dequeue \n3.PrintQueue");
		  ch=in.nextInt();
		  switch(ch)
		  {
		  case 1:
			  System.out.println("Enter elements in queue");
			  e=in.nextInt();
			  obj.enqueue(e);
			  break;
			  
		  case 2:
			  obj.dequeue();
			  break;
		  case 3:
			  obj.printQueue();
			  break;
		  default :
			  System.out.println("Wrong choice");
			  break;
		  case 0:
			  System.out.println("Exit...");
		  }
	  }while(ch!=0);
	  
  }
}
