
import java.util.Scanner;


public class CircularLinkedList 
{
 Node root,last;   
  void createLinkedList()
  {
      root=last=null;
  }
  void insertLeft(int e)
  {
      Node n=new Node(e); //n=new_node
      if(root==null)
      {
          root=last=n;//only for 1st
          last.next=root;
      }
      else
      {
          n.next=root;//1
          root=n;//2
          last.next=root;//3
          System.out.println("inserted");
      }
  }
  void deleteLeft()
  {
      if(root==null)
          System.out.println("Empty List");
      else
      {
          Node t=root;
          if(root==last)
          {
              root=last=null;
          }
          else
          {
           root=root.next;
           last.next=root;//3
          }
           System.out.println(t.data+" deleted");
      }
  }
  void insertRight(int e)
  {   Node n=new Node(e);
      if(root==null)
          root=n;//only for 1st
      else
      {   last.next=n;//1
          last=n;//2
          last.next=root;//3
          System.out.println("inserted");
      }
  }
  void deleteRight()
  {
      if(root==null)
          System.out.println("Empty List");
      else
      {
          Node t=root;
          Node t2=root;
          while(t!=last)
          {
              t2=t;
              t=t.next;
          }
          if(root==last)
            root=last=null;
          else
          {
              last=t2;
              last.next=root;
         
          }
          System.out.println(t.data+" deleted");
      }
  }
  
  void printList()
  {   if(root==null)
          System.out.println("Empty list");
      else
      {   Node t=root;//1
          do//2
          {
              System.out.print(t.data+"|->");
              t=t.next;
          }while(t!=root);
      }
  }
 
  public static void main(String args[])
    {
        int ch,e;
        CircularLinkedList obj=new CircularLinkedList();
        Scanner in=new Scanner(System.in);
        obj.createLinkedList();//root null
        do
        {
           System.out.println("\n1.Insert Left\n2.Insert Right\n3.Delete Left\n4.Delete Right\n5.Print all\n0.Exit\n:");
           ch=in.nextInt();
           switch(ch)
           {
               case 1:
                       System.out.println("Enter element:");
                       e=in.nextInt();
                       obj.insertLeft(e);
                       break;
                case 2:
                       System.out.println("Enter element:");
                       e=in.nextInt();
                       obj.insertRight(e);
                       break;
                case 3:
                       obj.deleteLeft();
                       break;
                case 4:
                      obj.deleteRight();
                       break;  
                case 5:
                    obj.printList();
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
     
}
