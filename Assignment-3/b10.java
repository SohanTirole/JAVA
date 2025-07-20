/*
10.Write a program to check if a year is leap year or not.
If a year is divisible by 4 then it is leap year but if the year is century year like 2000, 1900, 2100 then it must be divisible by 400. 
*/
import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int year;
        System.out.println("Enter any Year...");
        year = sc.nextInt();
        
        if(year%4==0)
        {
            if(year%100==0)
            {
                if(year%400==0)
                    System.out.println(year+" is Leap Year");
                else
                    System.out.println(year+" is not a Leap Yera");
            }
            else
            {
                System.out.println(year+" is Leap Year");
            }
        }
        else
        {
            System.out.println(year+" is not Leap Year...");
        }
    }

}