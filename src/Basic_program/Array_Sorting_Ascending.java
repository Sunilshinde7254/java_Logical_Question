package Basic_program;

public class Array_Sorting_Ascending 
{
	public static void main(String[] args) 
	{
      int arr[]= {10,40,20,60,30,50,70};
      int temp =0;
      for(int i =0;i<arr.length;i++)
      {
    	  for(int j =i+1;j<arr.length;j++)
    	  {
    		  if(arr[i]>arr[j])
    		  {
    			  temp = arr[i] ;
        		  arr[i]=arr[j];
        		  arr[j] = temp;
    		  }
    		  
    	  }
    	  System.out.println(arr[i]);
      }
      System.out.println("----------------------------------");
      for(int i =0;i<arr.length;i++)
      {
    	  for(int j =i+1;j<arr.length;j++)
    	  {
    		  if(arr[i]<arr[j])
    		  {
    			  temp = arr[i] ;
        		  arr[i]=arr[j];
        		  arr[j] = temp;
    		  }
    		  
    	  }
    	  System.out.println(arr[i]);
      }
	}
}
