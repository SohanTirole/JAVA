/*
6) Multiplication of two matrix
*/

import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Order of first Matrix");
        int Arows = sc.nextInt();
        int Acoloms = sc.nextInt();
        System.out.println("Enter the Order of Second Matrix");
        int Brows = sc.nextInt();
        int Bcoloms = sc.nextInt();

        int A[][] = new int[Arows][Acoloms];
        int B[][] = new int[Brows][Bcoloms];

        //Getting user input form user for First Matrix
        System.out.println("Enter the elemts of First Metrix");
        for(int r=0 ; r<Arows ; r++)
        {  
            System.out.println("Enter the "+Acoloms+" element in "+(r+1)+" row");
            for(int c=0 ; c<Acoloms ; c++)
            {
                A[r][c] = sc.nextInt();
            }
        }
        System.out.println();

        //Getting user input form user for Second Matrix
        System.out.println("Enter the elemts of Second Metrix");
        for(int r=0 ; r<Brows ; r++)
        {  
            System.out.println("Enter the "+Bcoloms+" element in "+(r+1)+" row");
            for(int c=0 ; c<Bcoloms ; c++)
            {
                B[r][c] = sc.nextInt();
            }
        }
        System.out.println();

        //Display the first 2D Array 
        System.out.println("First Matrix..");
        for(int r=0 ; r<Arows ; r++)
        {
            for(int c=0 ; c<Acoloms ; c++)
            {
                System.out.print(" "+A[r][c]);
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Second Matrix..");
        //Display the Second 2D Array 
        for(int r=0 ; r<Brows ; r++)
        {
            for(int c=0 ; c<Bcoloms ; c++)
            {
                System.out.print(" "+B[r][c]);
            }
            System.out.println();
        }

        int Multi[][] = new int[3][3];
        int sum = 0;
        System.out.println();
     
        for(int r=0 ; r<Arows ; r++)
        {
            for(int c=0 ; c<Bcoloms ; c++)
            {
                for(int i=0 ; i<Brows ; i++)
                {
                    sum += A[r][i]*B[i][c];
                }
                Multi[r][c] = sum;
                sum=0;
            }
        }
        
        System.out.println("Multiplication of Two Matrix..");
        for(int r=0 ; r<Brows ; r++)
        {
            for(int c=0 ; c<Bcoloms ; c++)
            {
                System.out.print(" "+Multi[r][c]);
            }
            System.out.println();
        }
    }
}