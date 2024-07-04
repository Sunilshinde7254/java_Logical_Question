package Basic_program;

public class primenumber2 
{
	public static void main(String[] args) 
	{
		int m =0,flag = 0;
		int num = 2;
		m = num/2;
		if(num == 0 || num ==1)
		{
			System.out.println("Not prime number");
		}
		else
		{
			for(int i=2;i<=m;i++)
			{
				if(num%2==0)
				{
					System.out.println("Not prime number");
					flag =1;
					break; 
				}
			}
			if(flag ==0)
			{
				System.out.println("Prime number");
			}
		}
	}
}
