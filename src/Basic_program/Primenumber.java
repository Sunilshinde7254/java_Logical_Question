package Basic_program;

public class Primenumber 
{
 public static void main(String[] args) 
 {
	 int num = 1;
	    boolean isPrime = true;
	    // Corner cases for 0 and 1
	    if (num <= 1) 
	    {
	        isPrime = false;
	    } 
	    else 
	    {
	        for (int i = 2; i * i <= num; i++) 
	        {
	            if (num % i == 0) 
	            {
	                isPrime = false;
	                break;
	            }
	        }
	    }
	
	if(isPrime)
	{
		System.out.println(num+" is prime number");
	}
	else
	{
		System.out.println(num+" not prime number");
	}
}
}
