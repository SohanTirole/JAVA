class Test
{
    public static void main(String args[])
    {
        //  Y
        int l = 5;
        for(int i=1; i<=5 ; i++)
        {
            for(int j=1 ; j<=5 ; j++)
            {
                if(j==l||i==1||i==5)
                    System.out.print("*");
                else
                    System.out.print(" ");
               
            }
            l--;
            System.out.println();
        }
    }
}