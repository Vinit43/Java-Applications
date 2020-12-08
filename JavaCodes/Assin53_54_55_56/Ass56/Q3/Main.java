import java.lang.*;
import java.util.*;

class Cap
{
	void Frequency(String arr)
	{
		int i = 0;
		int iCnt1 = 0;
		int iCnt2 = 0;
		
		for(i =0;i<arr.length();i++)
		{
			char c = arr.charAt(i);
			if(c>='a'&&c<='z')
			{
				iCnt1++;
			}
			else
			{
				iCnt2++;
			}
			
		}
		
		int iDiff =0;
        iDiff	=	iCnt1 - iCnt2;
		
		System.out.println("The difference is:"+iDiff);
		
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
	
	cobj.Frequency(str);

	
  }
}