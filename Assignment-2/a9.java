/*
9. Find the area of an equilateral triangle, the length of whose sides is 12 cm.
*/
import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        float Area, L;
        System.out.println("Enter the Side of Tringle : "); 
        L = sc.nextFloat();
        //Area=3/4 ×side2
        Area = (float)(((Math.sqrt(3))/4)*L*L);

        System.out.println("Area of the E. Tringl : "+Area+" cm^2");


    }
}