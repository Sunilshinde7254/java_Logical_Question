package Basic_program;
public class EvenNumberSum {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 2; i <= 10; i =i+ 2) {
            sum = sum+i;
        }
        System.out.println("Sum of even numbers from 1 to 10: " + sum);
    }
}
