package Basic_program;
import java.util.Scanner;
// Perfect Number : Sum of a number become given number.
// 6 = 1 + 2 + 3 ;        ..... Perfect number
// 28 = 1 + 2 + 4 + 7 +14   .... Perfect number
// 12 = 1 + 2 + 3 + 4 +6    .... Not perfect number
// Form means the reminder should be zero.
public class Perfect_Number 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
       // int num = 6;
		int sum = 0;
		for(int i =1 ;i<num;i++)	
		{
		    if(num% i ==0)
			{
				sum= sum+i;
			}
		}
		if(sum == num)
		{
			System.out.println("Number is perfect");
		}
		else
		{
			System.out.println("Number is  Not perfect");
		}
	}

}
