import java.lang.*;
import java.util.*;

class Digits
{
	
	
	void FIB(int arr[])
	{
		int N1 = arr[0];
		
		for(int i =1 ; i < (arr.length-1) ; i++)
		{
			if(arr[i] == arr[i-1]+arr[i+1])
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
		
		dobj.FIB(arr);
       
    }
}