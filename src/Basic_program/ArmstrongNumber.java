package Basic_program;
// ArmStrong number : Sum of power of each digit equals to given number
// 153 = 1^3  +5^3 + 3^3   = 1 + 125 + 27 = 153
// 1634 = 1^4 + 6^4 + 3^4 + 4^4 = 1 + 1296 + 81+ 256 = 1634
public class ArmstrongNumber 
{
	public static void main(String[] args) 
	{
		int sum = 0 ,r,temp,num= 153;
		temp = num;
		while(num>0)
		{
			r  = num%10;                      // 153 % 10 =  15  =3
			sum = sum+(r*r*r);                 //27  +  125 +  1  = 153  
			num = num/10;                      // 15 /10  =   1   =5
			                                   // 1/10    =   0   =1
		}
		if(temp ==sum)
		{
			System.out.println(" Armstromg number");
		}
		else
		{
			System.out.println(" Not armstrong number");
		}
	}
}
