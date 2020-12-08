import java.lang.*;
import java.util.*;
class Matrix
{
    void SumRow(int arr[][])
    {
		Scanner sobj = new Scanner(System.in);
		int iSum = 0;
		
		for(int i=0;i<arr.length;i++)
		{
			iSum = 0;
			for(int j=0;j<arr[i].length;j++)
			{
				iSum = iSum + arr[j][i];
			
			}
		System.out.println("The Addition from columns is:"+iSum);	
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
                System.out.println("Enter the element :"+j+" , "+i);
                arr[j][i] = sobj.nextInt();
            }
        }
		 
		

        Matrix mobj = new Matrix();

        mobj.SumRow(arr);
    }
}