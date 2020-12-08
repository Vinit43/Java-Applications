import java.lang.*;
import java.util.*;
class Matrix
{
    void SumRow(int arr[][])
    {
		
		
		for(int i=0;i<arr.length;i++)
		{
			int len = arr.length;
			len--;
			for(int j=0;j<arr[i].length;j++)
			{
				if(len>0&& j < len)
				{
				int temp = arr[i][j];
				arr[i][j] = arr[i][len];
				arr[i][len]=temp;
				}
				len--;
				
				System.out.print(arr[i][j]+"\t");
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