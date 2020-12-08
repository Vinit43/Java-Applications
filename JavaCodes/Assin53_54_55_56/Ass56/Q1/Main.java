import java.lang.*;
import java.util.*;

class Cap
{
	public void Capital(String arr)
	{
		int i = 0;
		int iCnt = 0;
		
		for(i =0;i<arr.length();i++)
		{
			char c = arr.charAt(i);
			if(c>='A'&&c<='Z')
			{
				iCnt++;
			}
		}
		System.out.println("The count of capital letter is:"+iCnt);
		
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
	
	cobj.Capital(str);

	
  }
}