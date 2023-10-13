import java.io.*;
class prog10
{
    public static void main(String args[])throws Exception
    {
        int a, rev=0, rem;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter value for a");
        a=Integer.parseInt(br.readLine());
        while(a>0);
        {
            rem=a %10;
            rev=rev * 10 +rem;
            a=a/10;

        }
        System.out.println("Reverse of given no=" +rev);
    }
}