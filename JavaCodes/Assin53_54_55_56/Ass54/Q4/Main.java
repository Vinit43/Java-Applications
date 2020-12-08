import java.lang.*;
import java.util.*;

class Digits
{
    int Mult(int iNo)
    {
		int iMul=1;
		
		while(iNo!=0)
		{
			int i = iNo%10;
			
			iMul=iMul*i;
			
			iNo=iNo/10;
		}
		return iMul;
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

        int iRet = dobj.Mult(value);

        System.out.println("The Count of even digits are :"+iRet);


    }
}