import java.lang.*;
import java.util.*;


class Sort
{
	public void RowSorT(int arr[][])
	
	{
		int temp=0;
		int min=0;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
			if(arr[i][j] > arr[i][j+1])
				{	
					temp=arr[i][j];
					arr[i][j]=arr[i][j+1];
					arr[i][j+1]=temp;
				
				}
			}
		}
		
	}
	
	
	/*
	  int i = 0, j = 0, temp = 0, min_i = 0,pass = 0;
        
        for(i = 0; i <arr.length; i++)
        {
            for(pass = 0; pass < arr[i].length-1; pass++)
            {
                min_i = pass;
                for(j = pass + 1; j < arr[i].length; j++)
                {
                    if(arr[i][min_i] > arr[i][j])
                    {
                        min_i = j;
                    }
                }
                // swap
                if(arr[i][pass] != arr[i][min_i])
                {
                    temp = arr[i][pass];
                    arr[i][pass] = arr[i][min_i];
                    arr[i][min_i] = temp;
                }
            }
        }
    }

	
	
	*/
	
	
	
	
	/*
	
	class Matrix extends Selection
{
    public void RowSort(int arr[][])
    {
        int i = 0, j = 0, temp = 0, min_i = 0,pass = 0;
        
        for(i = 0; i <arr.length; i++)
        {
                Sort(arr[i]);
        }
    }
}
	
	*/
	
	
	
	

}



class Main 
{
	
  public static void main(String[] args)
  {
	int value;
	
	Sort obj = new Sort();
	
    Scanner sobj = new Scanner(System.in);
	
	System.out.println("Enter number of rows");
	int row = sobj.nextInt();
	
	System.out.println("Enter number of columns");
	int col = sobj.nextInt();
	
	int arr[][]=new int[row][col];
	System.out.println("Enter the elements");
	
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr.length;j++)
	{
		arr[i][j]=sobj.nextInt();
	}
	}
	
	
		System.out.println("Entered elements are");
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr.length;j++)
	{
			System.out.print(arr[i][j]+"\t");
	}
	System.out.println();
	}
	
	obj.RowSorT(arr);
	System.out.println("SORTED ELEMETNS");
	
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr.length;j++)
	{
			System.out.print(arr[i][j]+"\t");
	}
	System.out.println();
	}
	
	
  }
} 