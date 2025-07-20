/*
16. W.A.P to convert temperature from Fahrenheit to Celsius and Celsius to Fahrenheit. For given problem you have to take choice from user. If user enter choice ‘c’ or ‘C’ then convert Fahrenheit to Celsius. If user enter choice ‘f’ or ‘F’ then convert Celsius to Fahrenheit.
*/
import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        char type;
        System.out.println("Enter the type of Teperature..if Temprature in Farenheit : 'F' or Celsius : 'C' ");
        type = sc.next().charAt(0);
        if(type == 'f'||type == 'F')
        { 
            System.out.println("Enter the Temprature in Farenheit..");
            
            float Fer = sc.nextFloat();
            float Cels =(Fer-32)*(5/9.0f);
             System.out.println("Ferenheit Temprature : "+Fer+" F\nConverted into\nCelsius Temprature : "+Cels+" C");
        }
        else if(type=='c'||type=='C')
        {
            System.out.println("Enter the Temprature in Celsius..");

            float Cels = sc.nextFloat();
            float Fer = ((Cels*9.0f)/5.0f)+32;
            System.out.println("Celsius Temprature : "+Cels+" C\nConverted into\nFerenheit Temprature : "+Fer+" F");
        }

    }
}