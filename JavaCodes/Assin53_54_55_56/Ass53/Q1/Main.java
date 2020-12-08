import java.lang.*;
import java.util.*;

class DifferenceEvnOdd
{
    int EvnOdd(int iNo)
    {
        int i = 0;
        int iSum1 = 0 , iSum2 = 0;
        Scanner sobj = new Scanner(System.in);

        for(i=1 ; i<=iNo ; i++)
        {
            System.out.println("Enter Number");
            int iNo1 = sobj.nextInt();

            if(iNo1%2 == 0)

            {
                iSum1 = iSum1 + iNo1;
            }
            else
            {

                iSum2=iSum2 + iNo1;
            }


        }

        int iDiff = iSum1 - iSum2;        
        
        return iDiff;
        
    }
}
class Demo
{
    public static void main(String[] arg)
    {
        DifferenceEvnOdd dobj = new DifferenceEvnOdd();

        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter number");
        
        int value = sobj.nextInt();

        int iRet = dobj.EvnOdd(value);

        System.out.println("The Differnece between summataion of even and odd number is:"+iRet);


    }
}