package Basic_program;

public class Array_reverse_number 
{
	public static void main(String[] args) 
	{
       int arr [] = {20,30,10,40,60,80};
       for(int ar:arr)
       {
    	   System.out.println(ar);
       }
       System.out.println("Reverse NUmber.......");
       for(int  i=arr.length-1;i>=0;i--)
       {
    	   System.out.println(arr[i]);
       }
	}
}
