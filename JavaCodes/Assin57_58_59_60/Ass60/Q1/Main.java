import java.lang.*;
import java.util.*;

class Strings
{
     void ConcatX(String str1 , String str2 , int no)
    {
        char arr[] = str1.toCharArray();
        char brr[] = str2.toCharArray();
		
		int len = 0;
		
		len = arr.length+brr.length+1;
		
		char crr[]=new char[len];
		
		if(no > brr.length)
		{
			no = brr.length;
		}
		
		int i = 0;
		
		for( i =0;i<arr.length;i++)
		{
			crr[i]=arr[i];
		}
		crr[i]=' ';
        for(int j =0;j<no;j++)
		{
			i++;
			crr[i]=brr[j];
		}
		
		System.out.println(crr);
		
    } 
}

 class Demo
 {
    public static void main(String args[])
    {
        Scanner sobj = new Scanner (System.in);

        System.out.println("Enter first string");
        String str1 = sobj.nextLine();

        System.out.println("Enter second string");
        String str2 = sobj.nextLine();

        System.out.println("Enter number of charecters of second string you want to concat with first string :");
        
		int no = sobj.nextInt();

       
        Strings ssobj = new Strings();
		
		ssobj.ConcatX(str1 , str2 , no);


    }
 }