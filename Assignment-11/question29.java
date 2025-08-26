//29) Program to print greatest number among 4 numbers
import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Eneter any For Number..");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        System.out.println();
        if(a>b&&a>c&&a>d)
            System.out.println(a+" is Greatest");
        else if(b>a&&b>c&&b>d)
            System.out.println(b+" is Greatest");
        else if(c>a&&c>b&&c>d)
            System.out.println(c+" is Greatest");
        else if(d>a&&d>b&&d>c)
            System.out.println(d+" is Greatest");
    }
}