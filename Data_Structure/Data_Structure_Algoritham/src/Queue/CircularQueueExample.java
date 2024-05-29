package Queue;
import java.util.Scanner;
public class CircularQueueExample 
{
 private int Maxsize,rear,front,queue[],count;  
void createQueue(int size)
{
    Maxsize=size;
    rear=-1;
    front=0;
    queue=new int[Maxsize];
    count=0;
}
void Enqueue(int e)
{
    rear=(rear+1)%Maxsize;
    count++;
    queue[rear]=e;
}
 boolean isFull()
 {
     if(count==Maxsize)
     return true;
     else
         return false;
 }
 int Dequeue()
 {
     int temp;
     temp=queue[front];
     front=(front+1)%Maxsize;
     count--;
     return(temp);
 }
 boolean isEmpty()
 {
     if(count==0)
        return true;
     else
         return false;
 }
 void printQueue()
 {
     int i=front;
     int c=0;
     while( c<count)
     {
         System.out.print(queue[i]+" ");
         i=(i+1)%Maxsize;
         c++;
     }
         
 }
 
 public static void main(String args[])
    {
        int ch,e,size;
        CircularQueueExample obj=new CircularQueueExample();
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

