/*
25. Write a Java program to calculate profit or loss. 
*/
import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        float Profit, Loss, SellingP, CostP;
        System.out.println("Enter the Cost of the Good :");
        CostP = sc.nextFloat();
        System.out.println("Enter the Selling Price of the Good");
        SellingP = sc.nextFloat();

        if(CostP>SellingP)
        {
            Loss = CostP -  SellingP;
            System.out.println("Your Bussiness in Loss of : "+Loss);
        }
        else
        {
            Profit = SellingP - CostP;
            System.out.println("Your Bussiness in Profit of : "+Profit);
        }

    }

}