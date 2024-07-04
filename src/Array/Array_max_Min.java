package Array;

public class Array_max_Min 
{
	public static void main(String[] args) 
	{  int temp =0;
	  int arr[] = {10,40,20,60,80,20};
	  
	  int min = arr[0];
	  int max = arr[1];
	
	  for(int i =0;i<arr.length;i++)
	  { 

      	if(arr[i]<min)
      	{
      		min = arr[i];
      	}
	  }
	  System.out.println(min);
	
	  for(int i =0;i<arr.length;i++)
      {
      	if(arr[i]>max)
      	{
      		max = arr[i];
      	}
      }
      System.out.println(max);
	  
	}

}
