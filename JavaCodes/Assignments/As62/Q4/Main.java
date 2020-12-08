import java.lang.*;
import java.util.*;

class Matrix
{
    public boolean CheckIdentity(int arr[][],int row,int col)
    {
        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < col; j++)
            {
                if(i == j)
                {
                    if(arr[i][j] != 1)
                    {
                        return false;
                    }
                    
                }
                else
                {
                    if(arr[i][j] != 0)
                    {
                        return false;
                    }

                } 
            }
        }

        return true;
    }
}

class Demo
{
    public static void main (String args[])
    {
        Scanner sobj = new Scanner (System.in);

        System.out.println("Enter the number of rows : ");
        int row = sobj.nextInt();

        System.out.println("Enter the number of columns : ");
        int col = sobj.nextInt();

        int arr[][] = new int[row][col];

        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < col; j++)
            {
                System.out.println("Enter in row : " + i +"and column " + j);
                arr[i][j] = sobj.nextInt(); 
            }
        }


       Matrix mobj = new Matrix();

        boolean bret = mobj.CheckIdentity(arr,row,col);

        if(bret == true)
        {
            System.out.println("Identity Matrix");
        }
        else
        {
            System.out.println("Not a Identity Matrix");            
        }

    }
}