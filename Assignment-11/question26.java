//26) Program to convert meter to feet
import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value in meter..");
        float m = sc.nextFloat();

        double f = m*3.28084;

        System.out.println(m+" Meter in Feet : "+f);
    }
}