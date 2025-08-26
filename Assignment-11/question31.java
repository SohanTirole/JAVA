//31. Program to convert days into years, weeks and days.
import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Day's..");
        int day = sc.nextInt();

        int temp = day;

        float rem = 1;

        float year = day/365;
        day = day%365;
        float week = day/7;
        day = day%7;

        System.out.println("In "+temp+" Day's..\nYear : "+year+"\nWeek : "+week+"\nDay  : "+day);
    }
}