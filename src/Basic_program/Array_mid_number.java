package Basic_program;

public class Array_mid_number 
{
	public static void main(String[] args) 
	{
		int arr [] = {10,20,30,40,50};
		int length = arr.length;
		int middleIndex = length / 2;

		if (length % 2 != 0) 
		{ 
			int middleNumber = arr[middleIndex];
			System.out.println("Middle number in the array: " + middleNumber);
		}
		
	}
}