/*
1.	 The perimeter of a rectangle is 230 cm. If the length of the rectangle is 70 cm, find its breadth and area.
*/
import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
         float L, Peri, B;
        double Area;
        System.out.println("Enter the Perimeter of the rectangle");
        Peri = sc.nextFloat();
        System.out.println("Enter the Length");
        L = sc.nextFloat();
        
        B = (Peri/2)-L;

        System.out.println("Breidth of the Rectangle : "+B);
        Area = L*B;
        System.out.println("Area of the ractangle is : "+Area);
        
    }
}