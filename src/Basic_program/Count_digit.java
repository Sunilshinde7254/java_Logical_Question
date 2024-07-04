package Basic_program;

public class Count_digit 
{
	public static void main(String[] args) 
	{
      int num = 100;
      int count=0;
      while(num>0)
      {
    	  num = num/10;
    	  count++;
      }
      System.out.println("Digit of number "+count);
	}
}
