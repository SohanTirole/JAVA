//25) Program to convert persons height from inches to cm
import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Person height into inches..");
        float inch = sc.nextFloat();

        float cm = (float)(inch*2.54);

        System.out.println(inch+" Inches in Centimeter : "+cm);
    }
}