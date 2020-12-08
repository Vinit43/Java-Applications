import java.lang.*;
import java.util.*;

class DisplayArray
{
    public int CountCap(char arr[])
    {
		int iCnt=0;
		
        for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>='A'&&arr[i]<='Z')
			{
				iCnt++;
			}
		
		
		}
		return iCnt;
		
            
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
        char arr[] = new char[no];

		int j = 0;
        for(int i = 0; i < no; i++)
        {
		
           arr[i] = sobj.next().charAt(j);
		   j++;
        }

        DisplayArray dobj = new DisplayArray();
		
		int ret  = dobj.CountCap(arr);
		System.out.println("The count of capital letters are : "+ret);
		

         
    }
}
