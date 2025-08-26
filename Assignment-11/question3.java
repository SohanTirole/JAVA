//3) WAP to convert temp from f to c
import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Temprature in Fahrenheit");
        float f = sc.nextFloat();
        //°C = (°F - 32) * 5/9
        double c = (f - 32)*(5.0/9.0);

        System.out.print("Temprature in Celsius : "+c);
    }
}