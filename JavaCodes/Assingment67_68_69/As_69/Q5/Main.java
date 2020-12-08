
import java.lang.*;
import java.util.*;

class Display
{
    public void DisplayPattern(int arr[])
    {

        System.out.println("Pattern is : ");
        
        int icnt = 0;
        for(int i = 0; i < arr.length; i++)
        {
            icnt = arr[i];
            for(icnt = 0; icnt < arr[i] ; icnt++)
            {
                System.out.print("*" + "\t");
            }
            System.out.println();
        }

    }
}


class Demo
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner (System.in);

        System.out.println("Enter the Number of integers you want to insert in array");
        int no = sobj.nextInt();

        System.out.println("Enter the integers in array");
        
        int arr[] = new int[no];

        for(int i = 0; i < no; i++)
        {
            arr[i] = sobj.nextInt();
        }
       
        Display dobj = new Display();

        dobj.DisplayPattern(arr);

    }
} 