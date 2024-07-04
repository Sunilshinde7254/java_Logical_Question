package Basic_program;

public class palidrome 
{
	public static void main(String[] args) 
	{
         int r , sum = 0 ,temp;
         int n = 121;
         
         temp = n;
         
         while(n>0)    // check n is grater then or not 
         {
        	 r = n% 10;         // 121 % 10   = 1
        	 sum = (sum *10)+r; // 0*10 + 12.2  = 12.2
        	 n = n/10;          //    122
         }
        if (temp == sum)
        {
        	System.out.println("Palindrome number");
        }
        else
        {
        	System.out.println(" not palindrome number");
        }
         
		}  
	}

