package Basic_program;

public class Array_Sum 
{
	public static void main(String[] args) 
	{ int sum = 0;
      int arr[] = {10,20,30,40,50,60};
      for(int i =0;i<arr.length;i++)
      { 
    	  sum = sum+arr[i];
    	  
      }
      System.out.println(sum);
	}
}
