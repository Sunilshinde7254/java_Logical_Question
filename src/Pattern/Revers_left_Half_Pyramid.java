package Pattern;

public class Revers_left_Half_Pyramid 
{
	public static void main(String[] args) {
		int rows = 5;

        for (int i = rows; i >= 1; i--) 
        {
          
            for (int j = rows; j >= i; j--)    //   Inner loop for printing spaces
            {
                System.out.print("  "); 
            }
          
            for (int k = 1; k <= i; k++) {
                System.out.print("* "); 
            }
           
            System.out.println();
        }
    }
	
	
}
