/*
15. WAP to check given year is a leap year or not 
*/
import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int Year;
        System.out.println("Enter any year...");
        Year = sc.nextInt();

        if(Year%4==0)
        {
            if(Year%100==0)
            {
                if(Year%400==0)
                    System.out.println(Year+" is Leap Year");
                else
                    System.out.println(Year+" is not a Leap Year");
            }
            else
                    System.out.println(Year+" is Leap Year");
        }
        else
            System.out.println(Year+" is not a Leap Year");
    }

}