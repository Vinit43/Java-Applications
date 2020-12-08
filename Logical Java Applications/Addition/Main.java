import java.lang.*;
import java.util.*;


class Arithmetic
{
	int Add(int iNo1 , int iNo2)
	{
		int iResult = 0;
		
		iResult = iNo1 + iNo2 ;
		
		return iResult;
	}
	
}

class Demo
{
	public static void main(String arg[])
	{
		int value1 = 0 , value2 = 0 , ret = 0;
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter First number");
		value1 = sobj.nextInt;
		System.out.println("Enter Second number");
		value2 = sobj.nextInt;
		
		Arithmetic aobj = new Arithmetic();
		
		ret = aobj.Add(value1 , value2);
		System.out.println("Addition is: "+ret);
		
	}
	
}