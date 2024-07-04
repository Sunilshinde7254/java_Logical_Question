package Array;

public class Example5_Nullelement 
{
 public static void main(String[] args) 
 {
	 String [] s = new String[7];
	 
	 s[0] = " Sunil";
	 s[2] = " Anil";
	 s[3] = " tejal";
	 s[5] = " Anuja";
	 for (int i =0 ;i<s.length;i++)
		 {
			 if(s[i] == null)
			 {
				 System.out.println(i);
			 }
		 }
	 
}
}
// Create the array with 5 element take the input from end user store into array print the addition of all elemnets. 