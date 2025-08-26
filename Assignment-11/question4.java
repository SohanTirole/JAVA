//4) WAP to convert temp from c to f
import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        //F = (°C × 9/5) + 32 
        System.out.println("Enter Temprature in Celsius");
        float c = sc.nextFloat();
        
        double f = (c*(9.0/5.0)+32);

        System.out.println("Temprature in Fehrenheit : "+f);
    }
}