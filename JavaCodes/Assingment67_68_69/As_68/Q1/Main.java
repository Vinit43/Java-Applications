import java.lang.*;
import java.util.*;

class DisplayArray
{
    public int[] ReverseArray(int arr[])
    {
        for(int i=0;i<arr.length;i++)
		{
			int temp = arr[i];
			int iRev = 0;
			
			while(temp!=0)
			{
				
		   int iDigit = temp%10;
		   
		   iRev= (iRev*10) + iDigit;
		   
		   temp = temp/10;
		 
			}
			arr[i]=iRev;
			
		}
		return arr;
		
            
    }
    
}

class Demo
{
    public static void main (String args[])
    {
        Scanner sobj = new Scanner (System.in);

        System.out.println("Enter the number of elements you want to insert in array : ");
        int no = sobj.nextInt();

        System.out.println("Enter the elements in array : ");
        int arr[] = new int[no];

        for(int i = 0; i < no; i++)
        {
            arr[i] = sobj.nextInt();
        }

        DisplayArray dobj = new DisplayArray();

        int brr[] = dobj.ReverseArray(arr); 

        System.out.println("Elements in array after reversing the number : ");
        for(int j = 0; j < no; j++)
        {
            System.out.print(brr[j] + "\t");
        }        
    }
}
