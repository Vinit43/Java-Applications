import MarvellousArray.ArrayX;

import java.lang.*;
import java.util.*;

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