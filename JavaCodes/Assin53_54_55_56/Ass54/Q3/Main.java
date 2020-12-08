import java.lang.*;
import java.util.*;

class Digits
{
    int Range(int iNo)
    {
		int iCnt=0;
		while(iNo!=0)
		{
			int i = iNo%10;
			if(i>=3 && i<=7)
			{
				iCnt++;
			}
			iNo=iNo/10;
		}
		return iCnt;
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

        int iRet = dobj.Range(value);

        System.out.println("The Count of even digits are :"+iRet);


    }
}