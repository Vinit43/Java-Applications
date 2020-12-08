package VinitLinkedList;

import java.lang.*;
import java.util.*;

class Node
{
	public int data;
	public Node next;
	
	public Node(int value)
	{
		data = value;
		next = null;
	}
	
}

public class SinglyLinkedList
{
	public Node Head;
	
	public SinglyLinkedList()
	{
		Head = null;
	}
	public void InsertFirst(int no)
	{
		Node newn = new Node(no);
		
		if(Head==null)
		{
			Head = newn;
		}
		else
		{
			newn.next=Head;
			Head=newn;
		}
	}
	public void InsertLast(int no)
	{
		Node newn = new Node(no);
		
		if(Head==null)
		{
			Head = newn;
		}
		else
		{
			Node temp = Head;
			
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next = newn;
		}
	}
	
	
	public void InsertAtPos(int no , int Pos)
	{
		int size = Count();
		
		if(Pos<0||Pos>size+1)
		{
			return;
		}
		if(Pos==1)
		{
			InsertFirst(no);
		}
		else if(Pos==size)
		{
			InsertLast(no);
		}
		else
		{
			Node newn = new Node(no);
			
			Node temp = Head;
			
			for(int i=1; i<Pos-1;i++)
			{
				temp=temp.next;
			}
			newn.next=temp.next;
			temp.next=newn;
		}
	}
	
	
	
	
	
	public void Display()
	{
		Node temp = Head ;
		
		while(temp!=null)
		{
			System.out.print("|"+temp.data+"|->");
			temp=temp.next;
		}
		System.out.println();
	}
	
	
	public int Count()
	{
		Node temp = Head ;
		int i= 0;
		
		while(temp!=null)
		{
			i++;
			temp=temp.next;
		}
		return i;
	}
	
	public void DeleteFirst()
	{
		if(Head==null)
		{
			return;
		}
		else
		{
			Head = Head.next;
		}
	}
	
	public void DeleteLast()
	{
		if(Head==null)
		{
			return;
		}
		else
		{
			if(Head.next==null)
			{
				Head = null;
				return;
			}
			else
			{
			Node temp = Head;
			
			while(temp.next.next!=null)
			{
				temp=temp.next;
			}
			temp.next=null;
			
			}
		
		}
	}
	
}
