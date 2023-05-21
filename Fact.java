import java.io.*;

class Fact
{
    public static void main(String args[])throws Exception
    {
        int a,fact=1,i=1;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        a=Integer.parseInt(br.readLine());
        while(i<=a)
        {
            fact=fact*i;
            i++;
        }
        System.out.println("Factorial is "  +fact);
    }
}