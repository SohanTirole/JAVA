/*
12.A 4 digit number is entered through keyboard. Write a program to print a new number with digits reversed as of orignal one. E.g.-
INPUT : 1234        OUTPUT : 4321
INPUT : 5982        OUTPUT : 2895
*/
import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int Digit, revers=0;
        System.out.println("Enter any 4 Digit Number");
        Digit = sc.nextInt();
        if(Digit>=1000&&Digit<=9999)
        {
            for(int i=1;Digit>0;i++)
            {
                int remender = Digit%10;
                
                revers = revers*10;
                revers = remender+revers;
                Digit = Digit/10;
            }
            System.out.println("Reversed : "+revers);

        }
        else
            System.out.println("Entered Nuber is not a 4 Digit Number");
    }

}