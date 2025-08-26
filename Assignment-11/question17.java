//17) Program to check whether entered character is an alphabet or not using conditional operator 
import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any anything");
        char ch = sc.next().charAt(0);

        String res = ch>=65&&ch<=90||ch>=97&&ch<=122 ? "Entered value is Alphabet" : "Entered values is not a Alphabet";

        System.out.println(res);
    }
}