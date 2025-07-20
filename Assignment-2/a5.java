/*
5. If it costs 1600 rs. to fence a rectangular park of length 20 m at the rate of 25 rs. per m², find the breadth of the park and its perimeter. Also, find the area of the field.
*/
import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Cost of fence : ");
        float costf = sc.nextFloat();
        System.out.println("Enter the Length park and Rate of fence ");
        float L = sc.nextFloat();
        float Rate = sc.nextFloat();
        //Cost=Perimeter×Rate per metre
        float Peri = costf/Rate;

        float B = (Peri/2)-L;
        float Area = L*B;

        System.out.println("Perimeter of the Park : "+Peri);
        System.out.println("Breidth of the park : "+B);
        System.out.println("Area of th Park : "+Area);

    }
}