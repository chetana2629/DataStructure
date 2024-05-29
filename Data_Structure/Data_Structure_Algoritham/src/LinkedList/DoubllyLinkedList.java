
import java.util.Scanner;

class Dnode
{
    int data;
    Dnode left,right;
    Dnode(int e)
    {
        data=e;
        left=right=null;
    }
}

public class DoubllyLinkedList 
{
  Dnode root;   
  void createLinkedList()
  {
      root=null;
  }
  void insertLeft(int e)
  {
      Dnode n=new Dnode(e);
      if(root==null)
          root=n;//only for 1st
      else
      {
          n.right=root;//1
          root.left=n;//2
          root=n;//3
          System.out.println("inserted");
      }
  }
  void deleteLeft()
  {
      if(root==null)
          System.out.println("Empty List");
      else
      {
          Dnode t=root;//1
          root=root.right;//2
          root.left=null;//3
          System.out.println(t.data+" deleted");
      }
  }
  void insertRight(int e)
  {   Dnode n=new Dnode(e);
      if(root==null)
          root=n;//only for 1st
      else
      {   Dnode t=root;//1
          while(t.right!=null)//2
             t=t.right;
          t.right=n;//3
          n.left=t;//4
          System.out.println("inserted");
      }
  }
  void deleteRight()
  {
      if(root==null)
          System.out.println("Empty List");
      else
      {
          Dnode t=root;
          while(t.right!=null)
              t=t.right;
          if(t==root)
            root=null;
          else
          {
              Dnode t2=t.left;
              t2.right=null;
          }
          System.out.println(t.data+" deleted");
      }
  }
  
  void printList()
  {   if(root==null)
          System.out.println("Empty list");
      else
      {   Dnode t=root;//1
          while(t!=null)//2
          {
              System.out.print(t.data+"|->");
              t=t.right;
          }
      }
  }
  void printRevList()//last to 1st
  {   if(root==null)
          System.out.println("Empty list");
      else
      {   Dnode t=root;//1
          while(t.right!=null)//2
              t=t.right;
          while(t!=null)
          {   System.out.print(t.data+"|->");
              t=t.left;
           }
      }
   }
  
  public static void main(String args[])
    {
        int ch,e;
        DoubllyLinkedList obj=new DoubllyLinkedList();
        Scanner in=new Scanner(System.in);
        obj.createLinkedList();//root null
        do
        {
           System.out.println("\n1.Insert Left\n2.Insert Right\n3.Delete Left\n4.Delete Right\n5.Print all\n6.Print Reverse\n0.Exit\n:");
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
                case 6:
                    obj.printRevList();
                    break;
                default:
                    System.out.println("Wrong option");
                    break;
                case 0:
                    System.out.println("Exiting ");
                    break;
                    
           }   //switch         
           }while(ch!=0);
        }
  }
}
