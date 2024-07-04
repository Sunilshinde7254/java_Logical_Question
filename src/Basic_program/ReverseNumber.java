package Basic_program;

public class ReverseNumber 
{
	public static void main(String[] args) {
		 int rev = 0,num=1234,rem;
		 while(num>0)
		 {
			 rem = num%10;                   // 1234 % 10 =     
			 rev = rev *10+rem;              //4321
			 num = num/10;
			 
			       
		 }
		 
		 System.out.println(rev);
	}
   
}
