package Pattern;

public class HollowSquarePattern {
    public static void main(String[] args) {
        int rows = 6;
        int columns = 5;
        
        for (int i =1 ;i<=rows ;i++)  
        {
        	for(int j = 1;j<=columns ;j++)
        	{
        		if(i == 1 || i==rows || j==1 || j==columns)
        		{
        			 System.out.print("*  ");
        		}
        		else
        		{
        			System.out.print("   ");
        		}
        	}
        	System.out.println();
        }
    }
}
