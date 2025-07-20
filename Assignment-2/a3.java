/*
3. How many tiles whose length and breadth are 13 cm and 7 cm respectively are needed to cover a rectangular region whose length and breadth are 520 cm and 140 cm? 
*/
import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        float TL, TB, RL, RB,Areat, Arear;
        
        System.out.println("Enter the length and breidth of the tile : ");
        TL = sc.nextFloat();
        TB = sc.nextFloat();
        System.out.println("Enter the length and breidth of the Region : ");
        RL = sc.nextFloat();
        RB = sc.nextFloat();
        
        Areat = TL * TB;
        Arear = RL * RB;
        float NOT = Arear/Areat;
        System.out.println("Total number of tile : "+NOT);
    }
}