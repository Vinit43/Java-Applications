import java.lang.*;
import java.util.*;

class Cap
{
	int Frequency(String str)
	{
		int i = 0;
		int iCnt1 = 0;
		
		
		char arr[]=str.toCharArray(); 
		int size=arr.length;
		
		while(i<size)
		{
			
			if(arr[i]==' ')
			{
				while((i<size)&&(arr[i]==' '))
				{
					i++;
				}
			}
			else if((i<size)&&arr[i]!=' ')
			{
				iCnt1++;
				while((i<size)&&(arr[i]!=' '))
				{
					i++;
				}
			}
			
		}			
			
			
			
		return iCnt1;
	}
	
	
}

class Main {
	
  public static void main(String[] args)
  {
    Scanner sobj = new Scanner(System.in);

    String str;
    
    System.out.println("Enter username"); 

    str = sobj.nextLine();
	
	Cap cobj = new Cap();
	
	int iRet = cobj.Frequency(str);
	System.out.println("The number of words are:"+iRet);

	
  }
}