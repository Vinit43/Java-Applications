
import java.lang.*;
import java.util.*;

class Display
{
    public int CountFrequency(char arr[], char ch)
    {
        
        int icnt = 0;
        for(int i = 0; i < arr.length; i++)
        {
            char j = 0;
            if((arr[i] >= 'a')&&(arr[i] <= 'z'))
            {
                j = (char)(arr[i] - 32);
            }
            if((arr[i] >= 'A')&&(arr[i] <= 'Z'))
            {
                j = (char)(arr[i] + 32);
            }

            if(arr[i] == ch)
            {
                icnt++;
            }
            else if(j == ch)
            {
                icnt++;
            }
        }

        return icnt;
    }
}


class Demo
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner (System.in);

        System.out.println("Enter the String of array");
        String str = sobj.nextLine();

        System.out.println("Enter the character");
        char ch = sobj.next().charAt(0);

        char arr[] = str.toCharArray();

        Display dobj = new Display();

        int iret = dobj.CountFrequency(arr,ch);

        System.out.print("Frequency of that character is : "+ iret);

    }
}