//11) Perform all relational operations
import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two Value for Performing relation operation..");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("a == b: " +(a == b));   
        System.out.println("a != b: " +(a != b));  
        System.out.println("a > b: " +(a > b));     
        System.out.println("a < b: " +(a < b));     
        System.out.println("a >= b: " +(a >= b));
        System.out.println("a <= b: " +(a <= b));  
    }
}