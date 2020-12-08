
import java.lang.*;
import java.util.*;

class Display
{
    public void AddArray(int arr[],int brr[])
    {
        int i = 0, j = 0, Min = 0, Min1 = 0;
        for(i = 0,min = arr[i]; i < arr.length; i++)
        {
         
            if(Min > arr[i])
            {
                Min = arr[i];
            }
        }
        for(j = 0,Min1 = brr[j]; j < brr.length; j++)
        {
           
            if(Min1 > brr[j])
            {
                Min1 = brr[j];
            }
        } 
        System.out.println("Minimum from first array is : " + Min);    
        System.out.println("Minimum from second array is : " + Min1);
    }
}

class Demo
{
    public static void main (String args[])
    {
        Scanner sobj = new Scanner (System.in);

        System.out.println("Enter the number of elements you want to insert in first array : ");
        int iNo = sobj.nextInt();

        System.out.println("Enter the elements in array : ");
        int arr[] = new int[iNo];

        for(int i = 0; i < iNo; i++)
        {
            arr[i] = sobj.nextInt();
        }

        System.out.println("Enter the number of elements you want to insert in second array : ");
        int iNo1 = sobj.nextInt();

        System.out.println("Enter the elements in array : ");
        int brr[] = new int[iNo1];

        for(int j = 0; j < iNo1; j++)
        {
            brr[j] = sobj.nextInt();
        }

        Display dobj = new Display();

        dobj.AddArray(arr,brr);
    }
}
