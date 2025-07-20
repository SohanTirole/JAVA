/*
8. Find the base of a triangle whose altitude is 20 cm and area is 0.8 m².
*/
import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        float H, B, Area;
        System.out.println("Enter the Height of traingle ");
        H = sc.nextFloat();
        System.out.println("Enter the Area of Traingle : ");
        Area = sc.nextFloat();
        H = H/100;
        B = (2*Area)/H;
        System.out.println("Base of the Traingle : "+B);
    }
}