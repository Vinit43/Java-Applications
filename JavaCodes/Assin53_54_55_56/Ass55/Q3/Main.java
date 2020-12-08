import java.lang.*;
import java.util.*;

class Digits
{
	
	
	int Check(int arr[] , int iNo)
	{
		int i = 0;
		
		for(i =arr.length-1; i>=0  ; i--)
		{

			
			if(arr[i]==iNo)
			{
			  break;
			   
			}
		
		}
		return i ;

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
		
		int iRet = dobj.Check(arr , iNo);
		System.out.println("The last occurence is"+iRet);
		
		
       
    }
}