package Basic_program;
public class ArrayProduct 
{
    public static void main(String[] args) 
    {
        int arr[] = {1, 2, 3, 4, 5};
        
        // Calculate the product of elements before the current index
        int prefixProduct = 1;
        for (int i = 0; i < arr.length; i++)      // 1  , 2  ,3 
        {
            for (int j = 0; j < arr.length; j++)   
            {
                if (i != j) 
                {
                    prefixProduct =  prefixProduct* arr[j];
                }
            }
            System.out.println("Product of elements except arr[" + i + "]: " + prefixProduct);
            prefixProduct = 1; // Reset prefixProduct for next iteration
        }
    }
}
