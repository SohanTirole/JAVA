/*
11. Find even odd using switch case 
*/
import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number : ");
        int n = sc.nextInt();
        int res = n%2;
        switch(res)
        {
            case 0 : System.out.println(n+" is a Even Number");
                        break;
            case 1 : System.out.println(n+" is a Odd Number");
                        break;
            default : System.out.println(res+" ");
        }
    }

}