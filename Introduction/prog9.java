import java.io.*;
class prog9
{
    public static void main(String args[])throws Exception
    {
        int a,i=1, fact=1;
        //int n;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        a=Integer.parseInt(br.readLine());
        while(i<=a)
        {
            fact = fact * i;
            i++;
        }
        System.out.println("Factorial of given number=" +fact);
        }
    }

