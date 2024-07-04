package Array;

public class Example6_array_Addition 
{
	public static void main(String[] args) 
	{    int res = 0;
	
        int [] arr  = {30,20,70,40,10,50};
        
        int min = arr[0];
        int max = arr[0];
        
        for(int i =0 ;i<arr.length;i++)
        {
        	 res = res + arr[i];
        	
        	if (arr[i]<min)
        	{
        		min = arr[i];
        	}
        	if (arr[i] >max)
        	{
        		max = arr[i];
        	}
        	
        }
        System.out.println("Addition:"+res);
        System.out.println("Min:"+min);
    	System.out.println("Max:"+max);
        
	}
}
