import java.lang.*;
import java.util.*;

class Display
{
    public void AddArray(int arr[],int brr[])
    {
        int i = 0, j = 0, k = 0, l = 0;
        l = arr.length+brr.length;
        int crr[] = new int[l];

        for(i = arr.length, k = 0; i-1 >= 0 ; i--, k++)
        {
            crr[k] = arr[i-1];
        }
		
        for(j = brr.length; j-1 >= 0; j--, k++)
        {
            crr[k] = brr[j-1];
        }
        System.out.println("Array after reversing is : "); 
        for(k = 0 ; k < crr.length; k++)
        {
            System.out.print(crr[k] + "\t");
        }
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

        System.out.println("Enter the number of elements you want to insert in second array : ");
        int no1 = sobj.nextInt();

        System.out.println("Enter the elements in array : ");
        int brr[] = new int[no1];

        for(int j = 0; j < no1; j++)
        {
            brr[j] = sobj.nextInt();
        }

        Display dobj = new Display();

        dobj.AddArray(arr,brr);
    }
}
