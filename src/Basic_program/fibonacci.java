package Basic_program;

public class fibonacci 
{

	public static void main(String[] args) 
	{

		int n1 = 0 , n2 = 1 , n3, i , n = 10;
		
		System.out.print(n1+" "+n2);  
		
		for (i = 2 ;i<n;i++)
		{                                   // 1+1 = 2
			n3 = n1 + n2;                   // 1+2 = 3
			System.out.print(" "+n3);       //  2+3 = 5
			n1 = n2;                        //  3+5 = 8
			n2 = n3;                        //  5+8 = 13
		}
	}
}