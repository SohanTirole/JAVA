//21) Program to find out greater number between two numbers using conditional operator
import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any two number..");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int res = a>b ? a : b;

        System.out.println(res+" : is Greates Number");
    }
}