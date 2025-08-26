//33. program to print sum of two integers without +
import java.util.Scanner;
class Test
{
    public static void main(String[] args)
    {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter first number");
        int num1=inp.nextInt();
        System.out.println("Enter second number");
        int num2=inp.nextInt();
        System.out.println("Sum of both number is :"+-(-num1-num2));
    }
}