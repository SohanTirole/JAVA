/*
7. Find the height of a triangle whose base is 50 cm and whose area is 500 cm².
*/
import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        float H, B, Area;
        System.out.println("Enter the Area");
        Area = sc.nextFloat();
        System.out.println("Enter the base");
        B = sc.nextFloat();

        H = (2*Area)/B;
        System.out.println("Height of the Traingle is  : "+H+" cm");
    }
}