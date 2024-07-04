package Basic_program;

public class swapping {

	public static void main(String[] args) 
	{
		int num1 = 10;
		int num2 = 20;
		int temp;
		System.out.println("before swapping number :"+num1 +" "+num2);

		//    Using plus opertaor
		num1 = num1 + num2;      // 10+ 20  = 30 
		num2 = num1 - num2;      // 30- 20 = 10
		num1 = num1 - num2;      //  30 - 10 = 20 
		
		// Using temp varible 
		temp = num1;              // temp = 10;
		num1 = num2;              // num1 = 20;
		num2 = temp;              // num2 = 10;
		
		// Without using temp varible 
		num1 = num1 ^ num2;       // 
		num2 = num1 ^ num2;
		num1 = num1 ^ num2;

		System.out.println("After Swapping numner: "+num1 +" "+num2);

	}
}
