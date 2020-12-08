import java.lang.*;
import java.util.*;

class Strings
{
     int ConcatX(String str1 , String str2 )
    {
        char arr[] = str1.toCharArray();
        char brr[] = str2.toCharArray();
		int i = 0;

		if(arr.length==brr.length)
		{
		
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]!=brr[i])
			{
				return -1;
			}
		}
		
		}
		else
		{
			return -1;
		}
		
		return 1;
	
    } 
}

 class Demo
 {
    public static void main(String args[])
    {
        Scanner sobj = new Scanner (System.in);

        System.out.println("Enter first string");
        String str1 = sobj.nextLine();

        System.out.println("Enter second string");
        String str2 = sobj.nextLine();

        Strings ssobj = new Strings();
		
		int iRet=ssobj.ConcatX(str1 , str2 );
        
		if(iRet==-1)
		{
			System.out.println("Not same FALSE");
		}
		else
		{
			System.out.println("Same TRUE");
		}


    }
 }