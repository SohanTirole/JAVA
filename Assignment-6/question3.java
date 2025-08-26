//3. WAP to program calaculate the sum of all even element and all odd element of array
import java.util.Scanner;
class Test 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please let us know the size of Array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int SumEven=0, SumOdd=0;
        for(int i=0 ; i<n ; i++)
        {
            System.out.println("Please enter the "+(i+1)+" element of Array..");
            arr[i] = sc.nextInt();
            if(arr[i]%2==0)
                SumEven = SumEven + arr[i];
            else if(arr[i]%2!=0)
                SumOdd = SumOdd + arr[i];
            else
                System.out.println("Invelid Element");
        }
        System.out.println();
        System.out.println("Sum of total even element of Array : "+SumEven);
        System.out.println("Sum of total odd element of Array : "+SumOdd);

    }
}