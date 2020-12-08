import java.lang.*;
import java.util.*;

class Strings
{
     void ConcatX(String str)
    {
        char arr[] = str.toCharArray();
		int i = 0;
		int j = 0;
		char temp = '\0';
		
		for(i=0 , j=arr.length-1 ; i<=j ; i++,j--)
		{
		
			temp = arr[i];
			
			if((arr[j]>='A')&& (arr[j]<='Z'))
			{
				arr[i]=(char) ( (arr[j]) +32 );
			}
			else
			{
				arr[i] = (char) ((arr[j])-32);
			}
			
			if(temp>='A'&&temp<='Z')
			{
				arr[j]=(char)((temp)+32);
			}
			else
			{
				arr[j]=(char)((temp)-32);
			}
				
		}
		System.out.println(arr);
	
    } 
}

 class Demo
 {
    public static void main(String args[])
    {
        Scanner sobj = new Scanner (System.in);

        System.out.println("Enter first string");
        String str = sobj.nextLine();

        Strings ssobj = new Strings();

		ssobj.ConcatX(str);

    }
 }