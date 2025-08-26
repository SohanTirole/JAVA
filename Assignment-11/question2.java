//2) WAP to find out simple interest
import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        // SI = P × R × T / 100
        System.out.println("Please let us know the Principal Amount : ");
        int p = sc.nextInt();
        System.out.println("Please let us know the Rate of Intrest for Annualy");
        int r = sc.nextInt();
        System.out.println("Please let us know the Time Period in Year");
        int t = sc.nextInt();

        float si = (p*r*t)/100;

        System.out.println("Simple Interest : "+si);
    }
}