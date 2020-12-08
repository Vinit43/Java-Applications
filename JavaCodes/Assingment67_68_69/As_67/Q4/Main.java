
import java.lang.*;
import java.util.*;

class Display
{
    public void AddArray(int arr[],int brr[])
    {
        int i = 0, j = 0, k = 0, l = 0;
        l = arr.length+brr.length;
        int crr[] = new int[l];

        for(i = 0, k = 0; i < arr.length ; i++, k++)
        {
            crr[k] = arr[i];
        }
        for(j = 0; j < brr.length; j++, k++)
        {
            crr[k] = brr[j];
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
