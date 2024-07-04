package Interview;

public class Ex2 {

	public static void main(String[] args)
	 {
		String str="my name is ramesh Marwade";
		
		String[] str1= str.split(" ");
	
		
		for(int i= 0; i<=str1.length-1; i++)
		{
		     
		    if (str1[i]!=str1[3] & str1[i]!=str1[4])
		    {
		        System.out.print(str1[i]+" ");
		    }
		    
		    if (str1[i]==str1[3] || str1[i]==str1[4])
		    {
		        String str3=str1[3];
		        String rev=" ";
		        for( int j=str3.length()-1; j>=0; j--)
		        {
		            rev=rev+str3.charAt(j);
		          
		        }
		        System.out.print(rev);
		        
		        String str4=str1[4];
		        String rev1=" ";
		        for( int j=str3.length()-1; j>=0; j--)
		        {
		            rev1=rev1+str3.charAt(j);
		          
		        }
		        System.out.print(rev1);
		       
		    }
		    
		}}}
