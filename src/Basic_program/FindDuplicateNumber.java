package Basic_program;

public class FindDuplicateNumber 
{
 public static void main(String[] args) 
 {
	  int sum =0;
	 int arr[] = {1,3,5,7,9,2,4,6,3};
	 for(int i =0;i<arr.length;i++)
	 {
		 sum = sum+arr[i];
		 for(int j =i+1;j<arr.length;j++)
		 {
			 if(arr[i]==arr[j])
			 {
				 System.out.println(arr[i]);
			 }
		 }
	 }
	 System.out.println(sum);
	 System.out.println("Addituon of all Array:"+sum);
}
}
