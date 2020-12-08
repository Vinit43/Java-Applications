package MarvellousArray;

import java.lang.*;
import java.util.*;

public class ArrayX
{
	public int arr[];
	
	public ArrayX(int size)         // PARAMETERIZED CONSTRUCTOR
	{
		arr = new int[size];       //  Dynamic Memory Allocation
	}
	
	public void Accept()          //   Behaviour
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter the elements in array");
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			arr[i] = sobj.nextInt();
		}
	}
	public void Display()       // Behaviour
	{
		
		System.out.println("Entered elements in array are :");
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			System.out.print(arr[i]+"\t");
		}
	}
	
}

/*
class Main
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int size = sobj.nextInt();
		
		ArrayX aobj = new ArrayX(size);
		
		aobj.Accept();
		aobj.Display();
	}
	
	
}
*/