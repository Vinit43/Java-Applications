import java.lang.*;
import java.util.*;

class DemoString
{
	void Frequency(String str)
	{
		char arr[]=str.toCharArray(); 
		
		int iCnt1=0 ;
		int iCnt2=0;
		
		
		for( int i=0 ; i<arr.length ; i++ )
		{
			if(arr[i]>='a'&&arr[i]<='z')
			{
				iCnt1++;
			}
			else if(arr[i]>='A'&&arr[i]<='Z')
			{
				iCnt2++;
			}
			
		}
		
		
	}
	
	
}


class Main
{
	public static void main(String[] arg)
	{
		Scanner sobj = new  Scanner(System.in);
		System.out.println("Enter the string");
		
		String str = sobj.nextLine();
		
		DemoString dobj = new DemoString();
		dobj.Frequency(str);
		
		
		
	}
}