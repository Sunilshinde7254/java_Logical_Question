package Array;

public class Eaxmple4_Student 
{
	public static void main(String[] args)  throws Exception
	{
        Exa4_Student[] es= new Exa4_Student[5];
        
        es[0]= new Exa4_Student(1, " Sunil", 78);
        es[1]= new Exa4_Student(2, " Anil", 78);
        es[2]= new Exa4_Student(3, " Tejal", 78);
        for(Exa4_Student e : es)
        {
        	if(e == null)
        	{
        		System.out.println(e);
        	}
        	else
        	{
        		System.out.println(e.sid+ " "+ e.sname+ " "+e.smark );
        	}
        	
        }
        
	}
}
