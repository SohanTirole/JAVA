//22) Program to find out greater number among three numbers using conditional operator
import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any three number..");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int res = a>b&&a>c ? a : (b>a&&b>c ? b : c);

        System.out.println(res+" : is Greates Number");
    }
}