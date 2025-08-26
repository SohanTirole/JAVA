//32. Program to find maximum and minimum of two numbers without using loop and any condition.
import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two Value..");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int max = ( a + b +(int)Math.sqrt((a - b)*( a - b)))/2;
        int min = ( a + b -(int)Math.sqrt((a - b)*( a - b)))/2;

        System.out.println("Maximum value : "+max);
        System.out.println("Minimum value : "+min);
    }
}