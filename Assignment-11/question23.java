//23) Program to find out whether entered number is even or odd using conditional operator
import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number");
        int n = sc.nextInt();
         
        String res = n%2==0 ? "Even" : "Odd" ;

        System.out.println("Number Number is "+res);
    }
}