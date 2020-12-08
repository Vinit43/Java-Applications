import java.lang.*;
import java.util.*;

class Digits
{
	int CountDigit(int iNo)
	{
		int iCnt = 0;
		
		if(iNo<0)
		{
			iNo=-iNo;
		}
		
		while(iNo!=0)
		{
		iCnt++;
		iNo=iNo/10;
		}
		return iCnt;
	}
	
	
	
    boolean ArmStrong(int iNo)
	{
		int temp = iNo;
		int power = CountDigit(iNo);
		int iMul = 1;
		int i=0;
		int j=0;
		int iDigit = 0;
		int iSum = 0;
		
		while(iNo!=0)
		{
			iDigit = iNo % 10;
			
			iMul = 1;
			
			for(j=1;j<=power;j++)
			{
				iMul = iMul * iDigit;
				
			}
			iSum = iSum+iMul;
			if(iSum>temp)
			{
				break;
			}
			
			iNo=iNo/10;
		}
		
		if(temp == iSum)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
}


class Main
{
    public static void main(String[] arg)
    {
        boolean bret = false;
		
		Digits dobj = new Digits();
        
		Scanner sobj = new Scanner(System.in);
        
		System.out.println("Enter number");
        
		int value = sobj.nextInt();
        
		bret = dobj.ArmStrong(value);
        
		if(bret == true)
        {
            System.out.println("Number is Strong");
        }
        else
        {
            System.out.println("Number is not strong");
        }
    }
}