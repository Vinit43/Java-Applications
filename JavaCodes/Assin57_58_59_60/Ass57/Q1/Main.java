import java.lang.*;
import java.util.*;
class Matrix
{
    void Pattern(char arr[][])
    {
		
		for(int i = 0; i<arr.length; i++)
        {
			char ch = 'A';
		 for(int j = 0; j< arr[i].length; j++)
            {
                System.out.print(ch+"\t");
				ch++;
            }
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
        
		char arr[][] = new char[row][col];
        
		Matrix mobj = new Matrix();

        mobj.Pattern(arr);
    }
}