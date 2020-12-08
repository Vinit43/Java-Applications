
import java.lang.*;
import java.util.*;

class Display
{
    public char[] ConvertToSmall(char arr[])
    {
        for(int i = 0; i < arr.length; i++)
        {
            if((arr[i] >= 'A')&&(arr[i] <= 'Z'))
            {
                arr[i] = (char)(arr[i] + 32);
            }
        }

        return arr;
    }
}


class Demo
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner (System.in);

        System.out.println("Enter the String of array");
        String str = sobj.nextLine();

        char arr[] = str.toCharArray();

        Display dobj = new Display();

        char brr[] = dobj.ConvertToSmall(arr);

        for(int i = 0; i < brr.length; i++)
        {
            System.out.print(brr[i] + "\t");
        }

    }
}