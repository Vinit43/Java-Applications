import java.lang.*;
import java.util.*;

class Digits
{
	void FIB(int iRow , int iColumn)
	{
		int iCnt = 1;
		int i = 0;
		int j = 0;
		char c = 'A';
		
		for(i=1;i<=iRow;i++)
		{
			for(j=1;j<=iColumn;j++)
			{
				if(i==j)
				{
					System.out.print("&\t");
				}
				
				else if(i==1 || j==1 || i==iRow||j==iColumn)
				{
					System.out.print("*\t");
				}
				else if (i<j) 
				{
					System.out.print(iCnt+"\t");
					iCnt++;
				}
				else 
				{
					System.out.print(c+"\t");
					c++;
				}
			
			}
			System.out.println();
			
		}
		
		
	}
    
}
class Main
{
    public static void main(String[] arg)
    {   
		Digits dobj = new Digits();
        
		Scanner sobj = new Scanner(System.in);
        
		System.out.println("Enter number of Rows");
        
		int value = sobj.nextInt();
        
		System.out.println("Enter number of Columns");
		int value2 = sobj.nextInt();
		
		
		dobj.FIB(value , value2);
       
    }
}