/*
5. Write a java program which accept two array from user and check
whether that array and its elements are palindrome or not.
Input : 11 252 387783 252 11
Output : TRUE
Input : 11 252 387783 77 11
Output : FALSE
Input : 11 252 786 252 11
Output : FALSE
Input : 11 252 786 253 11
Output : FALSE 
*/

import java.lang.*;
import java.util.*;

class Display
{
    public int AddArray(int arr[])
    {
		int j = arr.length-1 ;
		int i = 0;
		
		
		
        for(i=0 ; i<j ;i++)
        {
			if(arr[i]!=arr[j])
		{
			return -1;
		}
		j--;
			
		}
		return 1;
		
	}
	
	public int Palindrome(int arr[])
	{
		
		int iRev = 0;
		int iDigit = 0;
		
		for(int k=0;k<arr.length;k++)
		{
			iRev = 0;
			iDigit=0;
			
			int temp = arr[k];
			
			while(arr[k]!=0)
			{
			iDigit = arr[k] % 10 ;
			
			iRev = (iRev*10)+iDigit;
			
			arr[k] = arr[k]/10;
			}
			
			if(temp!=iRev)
			{
				return -1;
			}
		}
		return 1;
		
	}
}

class Demo
{
    public static void main (String args[])
    {
        Scanner sobj = new Scanner (System.in);

        System.out.println("Enter the number of elements you want to insert in first array : ");
        int no = sobj.nextInt();

        System.out.println("Enter the elements in array : ");
        int arr[] = new int[no];

        for(int i = 0; i < no; i++)
        {
            arr[i] = sobj.nextInt();
        }


		Display dobj = new Display();

        int bret = dobj.AddArray(arr);
		 System.out.println("BRET IS:"+bret);
		
		int iret = dobj.Palindrome(arr);
		 System.out.println("iRet is:"+iret);
		
		if( (bret==1) && (iret==1))
		{
		 System.out.println("Palindrome");
		}
		else
		{
	
		 System.out.println("Not Palindrome");

		}

        
    }
}
