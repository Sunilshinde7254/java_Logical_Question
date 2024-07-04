package Basic_program;

public class Primenumber1toN 
{
 public static void main(String[] args) 
 {
	 int num = 10;
	// boolean isprime = true;
	 for(int i=1 ;i<=num;i++)
	 {   boolean isprime = true;
		 for(int j = 2;j<i;j++)          
		 {
			 if(i%j==0)
			 {
				 isprime = false;
				 break;
			 }
		 }
		 if(isprime)
		 {
			 System.out.println("Prime number: "+i);
			
		 }
		 
	 }
}
}
