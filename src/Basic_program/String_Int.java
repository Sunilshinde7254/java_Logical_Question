package Basic_program;
//Q. How to convert int number to String
public class String_Int 
{
	public static void main(String[] args) 
	{
      int num = 12345;
     // String str = num;   // Not allowed
      String str = String.valueOf(num);
      System.out.println(str);
     
      
      
	}
}
