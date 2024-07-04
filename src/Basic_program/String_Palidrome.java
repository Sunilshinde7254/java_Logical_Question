package Basic_program;

public class String_Palidrome 
{
	
	
	public static void main(String[] args) 
	{
		String name = "Sunil";
		String rev = " ";
		
		for(int i = name.length()-1;i>=0 ;i--)
		{
			rev = rev+name.charAt(i);
		}
		System.out.println(" Reverese"+rev);
		
		
		if(name.equals(rev))
			
		{
			System.out.println(" Palindrome");
		}
		else
		{
			System.out.println(" Not palindrome");
		}
	}
}
