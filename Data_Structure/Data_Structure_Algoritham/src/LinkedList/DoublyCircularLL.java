package Stack;

import java.util.Scanner;

class DNode{
	int data;
	DNode left,right;
	DNode(int d){
		data = d;
		left=right=null;
	}
}

public class DoublyCircularLL {
	DNode root,last;
	void createLinkedList() {
		root=last=null;
	}
	
	void insertLeft(int data) {
		DNode n = new DNode(data);
		if(root==null) {
			root=last=n;
			last.right=root;
			root.left=last;
		}
		else
		{
			n.right=root;
			root.left=n;
			root=n;
			root.left=last;
			last.right=root;
			System.out.println("Inserted");
		}
	}
	
	void insertRight(int data) {
		DNode n = new DNode(data);
		if(root==null) {
			root=last=n;
			last.right=root;
			root.left=last;
		}
		else {
			n.left=last;
			last.right=n;
			last=n;
			last.right=root;
			root.left=last;
			System.out.println("Inserted");
		}
	}
	
	void deleteLeft() {
		if(root==null) {
			System.out.println("list Empty");
		}
		else {
			DNode t = root;
			if(root==last) {
				root=last=null;
			}
			else {
			root=root.right;
			root.left=last;
			last.right=root;
			}
			System.out.println(t.data+" Deleted");
		}
	}
	
	void deleteRight() {
		if(root==null) {
			System.out.println("list Empty");
		}
		else
		{
			DNode t = last;
			if(root==last) {
				root=last=null;
			}
			else {
			last=last.left;
			last.right=root;
			root.left=last;
			}
			System.out.println(t.data+" Deleted");
		}
	}
	
	void printClockwise() {
		if(root==null) {
			System.out.println("list Empty");
		}
		else {
			DNode t = root;
			do
			{
				System.out.print(t.data+"|->");
				t=t.right;	
			}
			while(t!=root);
		}	
	}
	
	void printAntiClockwise() {
		if(root==null) {
			System.out.println("list Empty");
		}
		else {
			DNode t = last;
			do
			{
				System.out.print(t.data+"|->");
				t=t.left;	
			}
			while(t!=last);
		}	
	}
	
	public static void main(String args[])
    {
        int ch,e;
        DoublyCircularLL obj=new DoublyCircularLL();
        Scanner in=new Scanner(System.in);
        obj.createLinkedList();//root null
        do
        {
           System.out.println("\n1.Insert Left\n2.Insert Right\n3.Delete Left\n4.Delete Right\n5.Print Clockwise\n6.Print AntiClockwise\n0.Exit\n:");
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
                    obj.printClockwise();
                    break;
                case 6:
                    obj.printAntiClockwise();
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


