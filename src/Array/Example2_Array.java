package Array;

public class Example2_Array 
{
	public static void main(String[] args) {
		int [] arr = new int [5];   // 0 0 0 0 0
		arr[0] = 10;
		arr[1] = 20;
		arr[3] = 30;
     for (int x :arr)
     {
    	 System.out.println(x);
     }
     
     
     String [] s = new String[5];  // NULL NULL NULL NULL
     s[1] = " Sunil";
     s[2] = " Anil";
     s[3] = " Tejal";
     for(String x :s)
     {
    	 System.out.println(x);
     }
	}
}
