//20) Program to get marks of 5 subjects from user and checks whether percentage lies in between 75 and 100 or not
import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Marks of five Subject..(0-100)");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();

        double per = ((a+b+c+d+e)/500.0)*100;

        if(per>=75&&per<=100)
            System.out.println("Percentage lies in between 75 and 100");
        else
            System.out.println("Percentage not lies in between 75 and 100");
    }
}