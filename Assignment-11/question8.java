//8) WAP to find out compound interest
import java.lang.Math;
import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        //CI = P( 1 + r/n)^nt - P
        System.out.println("Enter the Principle amount");
        int p = sc.nextInt();
        System.out.println("Enter the Annual Intrest rate");
        int i = sc.nextInt();
        System.out.println("Enter the time Period in Year");
        float t = sc.nextFloat();

        double amt = p*(Math.pow((1+i/100.0),t));

        double ci = amt-p;

        System.out.println("Compaund Intrest : "+ci);
    }
}