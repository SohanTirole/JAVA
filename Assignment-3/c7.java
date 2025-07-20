/*
7. WAP to find greater among three number
*/
import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        float a,b,c;
        System.out.println("Enter any three number : ");
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();

        if(a>b)
        {
            if(a>c)
                System.out.println(a+" is the Greates Number");        
            else
                System.out.println(c+" is the Greates Number");
        }
        else
        {
            if(b>c)
                System.out.println(b+" is Greatest");
            else
                System.out.println(c+" is Greatest");
        }

    }

}
