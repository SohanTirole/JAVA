//7) WAP to find out volume of cylinder
import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        //V = πr²h 
        System.out.println("Enter the Radius of Cylender");
        float r = sc.nextFloat();
        System.out.println("Enter the Height of Cylender");
        float h = sc.nextFloat();

        double v = (3.1416)*(r*r)*h;

        System.out.println("Volukme of Cylender : "+v); 
    }
}