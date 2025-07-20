/*
4. Find the cost of tiling a rectangular plot of land 300 m long and 150 m wide at the rate of $6 per hundred square m. 
*/
import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        float L, W,rate, Area;
        System.out.println("Enter the Length and Width of the plot : ");
        L = sc.nextFloat();
        W = sc.nextFloat();
        System.out.println("Enter the Rate of tiling : ");
        rate = sc.nextFloat();
        double Cost;
        Area = L*W;
        Cost = (Area/100)*rate;
        System.out.println("Total Cost : "+Cost);
    }
}