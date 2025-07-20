/*
11. The base and height of a triangle are in the ratio 8 : 5 and its area is 320 m². Find the height and base of the triangle.
*/
import java.util.Scanner;
class Test
{
    public static void main(String args[])
        {
        Scanner sc = new Scanner(System.in);
        float B, H, Area,x;
        System.out.println("Enter the Height and Base of the Triangle in Ratio : ");
        H = sc.nextFloat();
        B = sc.nextFloat();
        
        System.out.println("Enter the Area of Triangle : ");
        Area = sc.nextFloat();

        x = (float)(Math.sqrt((Area*2)/40));
        //Assume Bx is Base and Hx is height
        Area = ((B*x)*(H*x))/2;
        B = (2*Area)/H;
        H = (2*Area)/B;

        System.out.println("Base of Traingle : "+B+"\nHeight of Traingle is : "+H);

    }
}