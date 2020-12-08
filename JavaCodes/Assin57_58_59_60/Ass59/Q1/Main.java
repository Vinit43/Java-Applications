import java.lang.*;
import java.util.*;
class Matrix
{
    void Pattern( String str)
    {
		char arr[] = str.toCharArray();
		
		for(int i = 0; i<arr.length; i++)
        {
			
		 for(int j = 0; j< arr.length; j++)
            {
                System.out.print(arr[j]+"\t");
		
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
		
      
		
		String str;
		
		System.out.println("Enter the string");
		str = sobj.nextLine();
		
          
		Matrix mobj = new Matrix();

        mobj.Pattern(str);
    }
}