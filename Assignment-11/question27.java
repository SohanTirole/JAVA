//27) Program to convert feet to meter
import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value in feet..");
        float f = sc.nextFloat();

        double m =(double)(f*0.3048);

        System.out.println(f+" Feet into Meter : "+m);
    }
}