//15) Program to check whether entered character is in uppercase or not using conditional operator 
import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Character..");
        char ch = sc.next().charAt(0);
        String res = ch>=65&&ch<=90 ? "Upper Case Character" : "Not a Upper Character";

        System.out.println(res);
    }
}