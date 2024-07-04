package Basic_program;

import java.util.Scanner;

//Strong number : The sum fact of each digit is equal to given number.
// 145 : 1! + 4! + 5! == 1 + 24 + 120 = 145
public class Strong_number 
{
	public static void main(String[] args) 
	{ 
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enyer the number");
		int  number = sc.nextInt();	
		//	int number = 67;
		int temp = number;
		int sum=0;
		while(number!=0)
		{   
			int digit = number%10;       // take the first digit
			int fact = 1;
			for(int i = 1;i<=digit;i++)
			{
				fact = fact *i;
			}
			sum = sum+fact;             // add the fact operation in sum varible
			number = number/10;         //Remove the First digit number / 10
		}
		if(sum == temp)
		{
			System.out.println("Number is Strong");
		}
		else
		{
			System.out.println("Number is not Strong");
		}
	}
}
