//6. WAP to sort the array
import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please let us know the length of the Array");
        int n = sc.nextInt();
        int i;
        int arr[] = new int[n];
        for(i=0 ; i<n ; i++)
        {
            System.out.println("Please enter the "+(i+1)+" element..");
            arr[i] = sc.nextInt();
        }
        for(int j=0 ; j<arr.length ; j++)
        {   
            int flag = 0;
            for(i=0; i<(arr.length-1) ; i++)
            {
                int a;
                if(arr[i]>arr[i+1])
                {
                    a = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = a;
                    flag =1;
                }
            }
            if(flag==0)
                break;
        }
        System.out.println();
        System.out.println("Sorted Array : ");
        for(i=0 ; i<arr.length ; i++)
        {
            System.out.println(arr[i]);
        }

    }
}
