package Basic_program;

import java.util.Scanner;

//Adam Number: Initial number square is equal to reverse number square reverse.
// 12^2 -------->144
// 21^2 -------->441------>144
public class Adam_number 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the number");
		int number = sc.nextInt();
		
		int sqaure = number * number;
		int reverse = 0;
		while(number!=0)
		{
			int digit = number%10;
			reverse = reverse*10+digit;
			number = number/10;
		}
		int rnsquare = reverse * reverse;
		int rnsquarerev = 0;
		while(rnsquare != 0)
		{
			int digit = rnsquare %10;
			rnsquarerev = rnsquarerev *10+digit;
			rnsquare = rnsquare /10;
		}
		if(rnsquarerev == sqaure)
		{
			System.out.println("Your number is Adam number");
		}
		else
		{
			System.out.println("Nuber is not Adam nunber");
		}
	}
  
  
}
