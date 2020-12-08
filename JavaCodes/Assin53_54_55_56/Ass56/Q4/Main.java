import java.lang.*;
import java.util.*;

class Cap
{
	boolean CheckVowel(String arr)
	{
		int i = 0;
		int iCnt1 = 0;
		int iCnt2 = 0;
		
		for(i =0;i<arr.length();i++)
		{
			char c = arr.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
			{
				return true;
			}
			else
			{
				return false;
			}
			
		}
		
		
		
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
	
	boolean bRet = cobj.CheckVowel(str);
	if(bRet == true )
	{
		System.out.println("Present");
	}
	else
	{
		System.out.println("Not Present");
	}	
  }
}