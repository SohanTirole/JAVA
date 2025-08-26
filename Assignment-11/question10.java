//10) Perform all arithmetic operations
import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two value..");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Addition : "+(a+b));
        System.out.println("Subtracation : "+(a-b));
        System.out.println("Multiplication : "+(a*b));
        System.out.println("Division : "+(a/b));
        System.out.println("Remainder : "+(a%b));
    }
}