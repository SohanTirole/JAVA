/*  
11. Ask user to enter age, sex ( M or F ), marital status ( Y or N ) and then using following rules print their place of service.
if employee is female, then she will work only in urban areas.
if employee is a male and age is in between 20 to 40 then he may work in anywhere
if employee is male and age is in between 40 t0 60 then he will work in urban areas only.
And any other input of age should print "ERROR". 
*/
import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        char Gender, Marital;
        System.out.print("Enter your Gender : - male :'M',female : 'F' ");
        Gender = sc.next().charAt(0);
        System.out.println("Enter your Marital Status : Marride : 'Y' or Unmaride : 'N' ");
        Marital = sc.next().charAt(0);
        if(Gender=='F'||Gender=='f')
            System.out.println("she will work only in urban areas.");
        else
        {  
            System.out.println("Please Enter your Ege");
            int age = sc.nextInt();
            if(age>=20&&age<40)
                System.out.println("You can work Anywhere..");
            else
            {   
                if(age>=40&&age<=60)
                    System.out.println("You will work in Urban Area only..");
                else
                    System.out.println(" ERROR ");
            }   
        }
    }

}