import java.lang.*;
import java.util.*;

class Digits
{
	
	
	int Check(int arr[] )
	{
		int i = 0 , j=0;
		int iMul = 1;
		
		for(i =0; i < arr.length ; i++)
		{

			
			if(arr[i]%2!=0)
			{
			  iMul = iMul * arr[i];
			  j++;
			   
			}
		}
		if(j!=0)
		{
		return iMul ;
		}
		else
		{
			return 0;
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
	
		
		int iRet = dobj.Check(arr );
		System.out.println("The Product is"+iRet);
		
		
       
    }
}