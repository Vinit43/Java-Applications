import java.lang.*;
import java.util.*;
class Digits
{
    int GenericRoot(int iNo)
    {
        int iSum = iNo;
        int iDigit = 0;

        if(iNo < 10)
        {
            return iNo;
        }
        else
        {
            while(iSum<=9)
            {
            while(iNo!=0)
            {
                iDigit = iNo%10;

               iSum=iSum+iDigit;

               iNo = iNo/10;
           }

                return iSum;
            }
        }
     
    }
class Demo
{
    public static void main(String arg[])
    {
        Digits dobj = new Digits();
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter number");
        int value = sobj.nextInt();
        int ret = dobj.GenericRoot(value);
        System.out.println("Generic root is : "+ret);
    }
}