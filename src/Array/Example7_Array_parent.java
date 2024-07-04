package Array;

class animal
{

}
class Dog extends animal
{

}
class Puppy extends Dog
{

}
public class Example7_Array_parent 
{

	public static void main(String[] args) 
	{
       animal a = new animal();
       Dog d = new Dog();
       Puppy p = new Puppy();
       
       animal [] arr = new animal[3];
       arr[0] = a;
       arr[1] = d;
       arr[2] = p;
       for(animal aa : arr)
       {
    	   System.out.println(aa);
       }
	}
}
