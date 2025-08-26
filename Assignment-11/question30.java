//30) Program to find out compound interest if principal is greater than or equals to 500 otherwise find out simple interest using conditional operator
import java.util.Scanner;
class Test{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Principal Amount");
        int p = sc.nextInt();
        System.out.println("Enter the Time in year");
        float t = sc.nextFloat();
        System.out.println("Enter the Rate of Interest");
        float r = sc.nextFloat();
        
        char res = p>=500 ? 'y' : 'n';

        switch(res)
        {
            case 'y' : double ci = (p*(Math.pow((1+(r/100.0)),t))-p);
                        System.out.println(String.format("Compaund Interest : %.2f",ci));
                        break;
            case 'n' : float si =(float)((p*r*t)/100.0);
                        System.out.println("Simple Interest : "+si);
                        break;
        }
    }
}