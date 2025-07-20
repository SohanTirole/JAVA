/*
14. WAP to find lowest number among four different number 
*/
import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a,b,c,d;
        System.out.println("Enter the Value of A, B, C and D");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        
        if(a<b&&a<c&&a<d)
            System.out.println(a+" is Lowest");
        else if(b<a&&b<c&&b<d)
            System.out.println(b+" is Lowest");
        else if(c<a&&c<b&&c<d)
            System.out.println(c+" is Lowest");
        else
            System.out.println(d+" is Lowest");
        
    }
}