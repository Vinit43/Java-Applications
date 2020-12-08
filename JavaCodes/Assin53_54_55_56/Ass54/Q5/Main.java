import java.lang.*;
import java.util.*;

class Digits
{
    int Diff(int iNo)
    {
		int iDif=0;
		int iSum1=0;
		int iSum2=0;
		
		while(iNo!=0)
		{
			int i = iNo%10;
			if(i%2==0)
			{
				iSum1 = iSum1 + i;
			}
			else
			{
				iSum2 = iSum2 +i;
			}
			
			iNo=iNo/10;
		}
		iDif = iSum1  - iSum2 ;
		return iDif;
    }
}

class Demo
{
    public static void main(String[] arg)
    {
        Digits dobj = new Digits();

        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter number");
        
        int value = sobj.nextInt();

        int iRet = dobj.Diff(value);

        System.out.println("The Count of even digits are :"+iRet);


    }
}