import java.lang.*;
import java.util.*;

class Digits
{
	
	
	int FIB(int arr[] , int iNo)
	{
		int value = 0;
		
		for(int i =0 ; i < (arr.length-1) ; i++)
		{
			int iMax = arr[i];
			int iMin = arr[j];
			
			if(arr[i]==iNo  )
			{
				value = arr[i];
			   break ;
			}
			if(arr[i]>iNo)
			{
			   
			}
			
		
		}
		return value;
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
		
		int iRet = dobj.FIB(arr , iNo);
		System.out.println("YES IT IS PRESENT"+iRet);
		
       
    }
}