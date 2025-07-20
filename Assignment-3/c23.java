/*
23. Write a Java program to input day number and print week day. 
*/
import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int n; 
        System.out.println("Enter Any Day Numbre between 1 to 7");
        n = sc.nextInt();
            switch(n)
            {
                //Monday, Tuesday, Wednesday, Thursday, and Friday Saturday and Sunday
                case 1 : System.out.println("Sunday");
                            break;
                case 2 : System.out.println("Monday");
                            break;
                case 3 : System.out.println("Tuesday");
                            break;
                case 4 : System.out.println("Wednesday");
                            break;
                case 5 : System.out.println("Thursday");
                            break;
                case 6 : System.out.println("Friday");
                            break;
                case 7 : System.out.println("Saturday");
                            break;
                default: System.out.println("Invalid input");
            }    
    }
}