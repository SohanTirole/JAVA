//6) WAP to swap two numbers without using third variable
//(arithmetic operator | bitwise operator)  
import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number");
        int a = sc.nextInt();
        int b = sc.nextInt();

        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("After Swaping : \nA : "+a+"\nB : "+b);
    }
}