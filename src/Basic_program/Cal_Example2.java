package Basic_program;

import java.util.Scanner;

public class Cal_Example2 
{
	public static void main(String[] args) 
	{ 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two  Number ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
        
            System.out.println("Enter the number");
            int choice = sc.nextInt();
           switch (choice) 
           {
		case 1: 
		{
			
			int res = num1 + num2;
			System.out.println("Result:"+res);
			break;
				
		}
		case 2:
		{
			int res = num1 - num2;
			System.out.println("Result:"+res);
			break;
		}
		case 3:
		{
			int res = num1 * num2;
			System.out.println("Result:"+res);
			break;
		}
		case 4 :
		{
			int res = num1 % num2;
			System.out.println("Result:"+res);
			break;
		}
		default:
			System.out.println(" Defalut");
		}

	}
}
