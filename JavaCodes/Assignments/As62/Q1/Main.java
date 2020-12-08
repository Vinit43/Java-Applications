import java.lang.*;
import java.util.*;
class Matrix
{
    void SumRow(int arr[][])
    {
		System.out.println("TRANSPOSE MATRIX IS");
		System.out.println();
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[j][i]+"\t");
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
        
		int arr[][] = new int[row][col];
        
		System.out.println("Enter the elements");
        
		for(int i = 0; i<arr.length; i++)
        {
            System.out.println("Row with index : "+i);
         
		 for(int j = 0; j< arr[i].length; j++)
            {
                System.out.println("Enter the element :"+i+" , "+j);
                arr[i][j] = sobj.nextInt();
				
            }
			
        }

        Matrix mobj = new Matrix();

        mobj.SumRow(arr);
    }
}