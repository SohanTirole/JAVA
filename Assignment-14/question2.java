class Test
{
    public static void main(String args[])
    {
        //  B
        for(int i=1; i<=5 ; i++)
        {
            for(int j=1 ; j<=5 ; j++)
            {
                if(j==1||i==1&&j!=5||i==3&&j!=5||i==5&&j!=5||i==2&&j==5||i==4&&j==5)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}