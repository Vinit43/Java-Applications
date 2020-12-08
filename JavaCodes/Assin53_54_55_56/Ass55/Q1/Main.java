import java.lang.*;
import java.util.*;

class Digits
{
	
	
	boolean Check(int arr[] , int iNo)
	{
		
		for(int i =0 ; i < arr.length ; i++)
		{

			
			if(arr[i]==iNo)
			{
			  return true;
			   
			}
		
		}
		return false ;

	}
}


class Main
{
    public static void main(String arg[])
    {   
		Digits dobj = new Digits();
        
		Scanner sobj = new Scanner(System.in);
        System.out.println("Enter number of elements");
		
		int size = sobj.nextInt();
		int arr[] = new int[size];
		
		System.out.println("Enter elements");
		for(int i = 0 ; i< arr.length ; i++)
		{
			arr[i] = sobj.nextInt();
		}
		System.out.println("Enter A Number");
		int iNo = sobj.nextInt();
		
		boolean bRet = dobj.Check(arr , iNo);
		if(bRet == true)
		{
		System.out.println("YES IT IS PRESENT");
		}
		else
		{
			System.out.println("IT IS NOT PRESENT");
		}
       
    }
}