
import java.lang.*;
import java.util.*;

class Display
{
    public int AddArray(int arr[],int brr[])
    {
        int Add1 = 0, Add2 = 0, Diff = 0;
        for(int i = 0; i < arr.length; i++)
        {
            Add1 = Add1 + arr[i];
        }
        for(int j = 0; j < brr.length; j++)
        {
            Add2 = Add2 + brr[j];
        } 
        Diff = (Add1 - Add2);

        return Diff;
    }
}

class Demo
{
    public static void main (String args[])
    {
        Scanner sobj = new Scanner (System.in);

        System.out.println("Enter the number of elements  in first array : ");
        int iNo1 = sobj.nextInt();

        System.out.println("Enter the elements in array : ");
        int arr[] = new int[iNo1];

        for(int i = 0; i < no; i++)
        {
            arr[i] = sobj.nextInt();
        }

        System.out.println("Enter the number of elements you want to insert in second array : ");
        int iNo2 = sobj.nextInt();

        System.out.println("Enter the elements in array : ");
        int brr[] = new int[iNo2];

        for(int j = 0; j < iNo2; j++)
        {
            brr[j] = sobj.nextInt();
        }

        Display dobj = new Display();

        int ret = dobj.AddArray(arr,brr);

        System.out.println("Difference is : " + ret); 
    }
}
