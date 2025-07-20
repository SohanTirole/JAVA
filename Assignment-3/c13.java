/*
13. Program to perform arithmetic operation using switch case
*/
import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Enter any two Value");
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println("Enter 1 for Addition\n \t2 for Subtraction");
        int cmd = sc.nextInt();
        switch(cmd)
        {
            case 1 : System.out.println("Addition : "+(a+b));
                        break;
            case 2 : System.out.println("Subtraction : "+(a-b));
                    break;
            default : System.out.println("Invalid Input");
        }

    }

}