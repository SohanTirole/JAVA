//24) check if both numbers are equals or not, if not then find out the greatest  number
import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any two number..");
        int a = sc.nextInt();
        int b = sc.nextInt();

        String res = a==b ? "A and B are equal" : ( a>b ? "A is Greatest" : "B is Greatest");

        System.out.println(res);
    }
}