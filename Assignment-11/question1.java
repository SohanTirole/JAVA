//1) WAP to find out average of 5 numbers
import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Five numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();

        float avrg = (a+b+c+d+e)/5;

        System.out.println("Average of Five Number : "+avrg);
    }
}