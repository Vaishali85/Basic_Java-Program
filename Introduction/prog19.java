import java.io.*;
class prog19
{
    public static void main(String args[])
    {
       int i=1, fact=1;
       int n=0;
        int a= Integer.parseInt(args[0]);
        while(i<=n)
        {
            fact=fact*i;
            i++;
        }
        System.out.println("Factorial of given no is"  +fact);
    }

}