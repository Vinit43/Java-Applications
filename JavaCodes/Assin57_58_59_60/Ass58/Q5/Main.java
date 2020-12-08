import java.lang.*;
import java.util.*;
class Matrix
{
    void Pattern(int iRow , int iCol)
    {	
		int k = 1;
		for(int i = 0; i<iRow; i++)
        {
		
			
		 for(int j = 0; j< iCol; j++)
            {
                System.out.print(k+"\t");
				
		
            }
			k++;
		System.out.println();	
			
        }
    }
}
class Demo
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
		
        System.out.println("Enter number of rows");
        
		int row = sobj.nextInt();
        
		System.out.println("Enter number of columns");
        
		int col = sobj.nextInt();
        
		Matrix mobj = new Matrix();

        mobj.Pattern(row , col);
    }
}