package Queue;
import java.util.Scanner;
public class LinearQueueExample 
{
 private int Maxsize,rear,front,queue[];  

 void createQueue(int size)
{
    Maxsize=size;
    rear=-1;
    front=0;
    queue=new int[Maxsize];
}
void Enqueue(int e)
{
    rear++;
    queue[rear]=e;
}
 boolean isFull()
 {
     if(rear==Maxsize-1)
     return true;
     else
         return false;
 }
 int Dequeue()
 {
     int temp;
     temp=queue[front];
     front++;
     return(temp);
 }
 boolean isEmpty()
 {
     if(front>rear)
    	 return true;
     else
         return false;
 }
 void printQueue()
 {
     for(int i=front;i<=rear;i++ )
         System.out.print(queue[i]+" ");
 }
 
 public static void main(String args[])
    {
        int ch,e,size;
        LinearQueueExample obj=new LinearQueueExample();
        Scanner in=new Scanner(System.in);
        System.out.println("Enter size:");
        size=in.nextInt();
        obj.createQueue(size);
        do
        {
           System.out.println("\n1.Enqueue\n2.Dequeue\n3.Print\n0.Exit\n:");
           ch=in.nextInt();
           switch(ch)
           {
               case 1:
                       if(obj.isFull()!=true)//not full
                       {
                           System.out.println("Enter element:");
                           e=in.nextInt();
                           obj.Enqueue(e);
                       }
                       else
                       {
                           System.out.println("Queue Full");
                       }
                       break;
                case 2:
                       if(obj.isEmpty()!=true)//not Empty
                       {
                           e=obj.Dequeue();
                           System.out.println("Element dequeued:"+e);
                       }
                       else
                       {
                           System.out.println("Queue Empty");
                       }
                       break;
                case 3:
                       if(obj.isEmpty()!=true)//not Empty
                       {
                          System.out.println("Elements on queue");
                          obj.printQueue();
                       }
                       else
                       {
                           System.out.println("Queue Empty");
                       }
                       break;  
                default:
                    System.out.println("Wrong option");
                    break;
                case 0:
                    System.out.println("Exiting ");
                    break;
           }//switch         
           }while(ch!=0);
        
        }
        
    }

