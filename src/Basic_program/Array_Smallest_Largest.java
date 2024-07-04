package Basic_program;

public class Array_Smallest_Largest 
{
	public static void main(String[] args) 
	{
       int arr [] = {30,10, 50, 20, 60 ,40};
       int min = arr[0];
       int max = arr[0];
       for(int i =0 ;i<arr.length;i++)
       {
    	   if(arr[i]<min)
    	   {
    		   min = arr[i];
    	   }
       }
       System.out.println("Smallest number in array.......");
       System.out.println(min);
       System.out.println("Largset number in arry........");
       for(int i =0 ;i<arr.length;i++)
       {
    	   if(arr[i]>max)
    	   {
    		   max = arr[i];
    	   }
       }
       System.out.println(max);
	}
}
