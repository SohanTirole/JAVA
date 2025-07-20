/*
6.Find the area of a triangle, sides of which are 10 cm and 9 cm and the perimeter 36 cm.
*/
import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        float a, b, c, peri;
        System.out.println("Enter the two side of Tringle");
        a = sc.nextFloat();
        b = sc.nextFloat();
        System.out.println("Enter the Perimeter : ");
        peri = sc.nextFloat();
        
        c = peri - (a+b);
        float s = (a+b+c)/2;

        double Area = Math.sqrt(s*((s-a)*(s-b)*(s-c)));

        System.out.println("Area of Trianlge is : "+Area+" cm^2");

    }
}