import java.lang.*;
import java.util.*;

class Anagram
{
	public void StrAngram(String str1 , String str2)
	{

	}
}
class Main
{
    public static void main(String[] arg)
    {
    	Scanner sobj = new Scanner(System.in);

    	String str1 ; 
    	String str2 ; 

    	System.out.println("Enter the first string");
    	str1 = sobj.nextLine();

    	System.out.println("Enter the second string");
    	str2 = sobj.nextLine();

    	Anagram aobj = new Anagram();

    	aobj.StrAngram(str1 , str2);
    	
    }
}