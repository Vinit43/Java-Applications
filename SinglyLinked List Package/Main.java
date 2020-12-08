import java.lang.*;
import java.util.*;
import VinitLinkedList.SinglyLinkedList;


class Main {
	
  public static void main(String[] args)
  {
	int value;
	
	SinglyLinkedList obj = new SinglyLinkedList();
	
    Scanner sobj = new Scanner(System.in);
	
	int ch = 1;
	
	while(ch!=0)
	{
	System.out.println();
	System.out.println("1.InsertFirst");
	System.out.println("2.InsertLast");
	System.out.println("3.DeleteFirst");
	System.out.println("4.DeleteLast");
	System.out.println("5.Display");
	System.out.println("6.Count");
	System.out.println("7.InsertAtPos");
	System.out.println("0.Exit");
	System.out.println();
	System.out.println("Enter your choice");
	ch = sobj.nextInt();
	
	switch(ch)
	{
		case 1:
		System.out.println("Enter the value");
		value = sobj.nextInt();
		obj.InsertFirst(value);
		break;
		
		case 2:
		System.out.println("Enter the value");
		value = sobj.nextInt();
		obj.InsertLast(value);
		break;
		
		case 3:
		obj.DeleteFirst();
		break;
		
		case 4:
		obj.DeleteLast();
		break;
		
		case 5:
		obj.Display();
		break;
		
		case 6:
		System.out.println("The number of elements in linked list are:"+obj.Count());
		break;
		
		case 7:
		System.out.println("Enter the value");
		value = sobj.nextInt();
		
		System.out.println("Enter the position");
		int pos = sobj.nextInt();
		obj.InsertAtPos(value , pos);
		break;
	
	}
		
	}	
	
	
  }
}