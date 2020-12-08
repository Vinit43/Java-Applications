import java.lang.*;
import java.util.*;

class Digits
{
	
	void Check(int arr[] , int iStart , int iEnd)
	{
		
		System.out.println();
		for(int i =0 ; i < arr.length ; i++)
		{

			
			if(arr[i]>=iStart&&arr[i]<=iEnd)
			{
				System.out.print(arr[i]+"\t");
			   
			}
		
		}

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
		System.out.println("Enter A Starting Number");
		int iNo = sobj.nextInt();
		
		System.out.println("Enter A End Number");
		int iNo2 = sobj.nextInt();
		
		dobj.Check(arr , iNo , iNo2);
		
		
		
       
    }
}