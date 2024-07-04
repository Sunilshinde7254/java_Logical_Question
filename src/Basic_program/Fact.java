package Basic_program;

public class Fact 
{
	public static void main(String[] args) 
	{
		int fact = 1, n = 5;
		for (int i = 1 ;i<=n ;i++)
		{
			fact = fact*i;                                       // 1*1 = 1
			//System.out.println(fact);                            // 1 * 2 = 2
		}                                                        // 6 * 4 = 24
	                                                             // 24 * 5 = 120                                           // 2 * 3 = 6
		System.out.println( "fact of 5 : "+fact);                         
			                            	                      //fact of 5 : 3628800




	}
}
