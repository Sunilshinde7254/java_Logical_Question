package Array;
// Strong the group of employee into  emp[].
public class Example3_emp 
{
public static void main(String[] args) 
{
	Exa3_Emp ex = new Exa3_Emp(1, " Sunil", 35000);
	Exa3_Emp ex2 = new Exa3_Emp(2, " Anil", 50000);
	Exa3_Emp ex3 = new Exa3_Emp(3, " Tejal", 65000);
	
	
	Exa3_Emp e [] = new Exa3_Emp[3];
	e[0] = ex;
	e[1] = ex2;
	e[2] = ex3;
	for (Exa3_Emp emp : e)
		{
			System.out.println(emp.eid+ " " +emp.ename+ " "+emp.esal);
		}
}
}
