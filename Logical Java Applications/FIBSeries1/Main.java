import java.lang.*;
import java.util.*;

class Digits
{
	void FIB(int iNo)
	{
		int iFirst=0;
		int i = 0;
		int iSecond=1;
		int iThird = 0;
		
		for(;iFirst<=iNo;)
		{
			System.out.print(iFirst+"\t");
			
			iThird=iFirst+iSecond;
			
			iFirst=iSecond;
			
			iSecond=iThird;
			if(iFirst > iNo)
			{
				break;
			}
			
		}
		
	}
    
}
class Main
{
    public static void main(String[] arg)
    {
        //boolean bret = false;
        
		Digits dobj = new Digits();
        
		Scanner sobj = new Scanner(System.in);
        
		System.out.println("Enter number");
        
		int value = sobj.nextInt();
        
		dobj.FIB(value);
       
    }
}