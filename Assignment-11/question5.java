//5) WAP to swap two numbers using third variable
import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int c = a;
        a = b;
        b = c;

        System.out.println("After Swaping : \nA : "+a+"\nB : "+b);
    }
}