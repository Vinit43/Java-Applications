import java.lang.*;
import java.util.*;
class Matrix
{
    void Pattern( String str)
    {
		char arr[] = str.toCharArray();
		
		
		
		
		for(int i = 0; i<(arr.length-1); i++)
        {
			
		 for(int j = 0; j< arr.length; j++)
            {
				
				if(i>=j)
				{
				
                System.out.print(arr[j]+"\t");
				}
            }
		System.out.println();	
			
        }
		for(int i = 0; i<(arr.length); i++)
        {
			
		 for(int j = 0; j< arr.length; j++)
            {
				if(i+j<=(arr.length-1))
				{
				
                System.out.print(arr[j]+"\t");
				}
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