import java.io.*;
class  prog8
{
    public static void main(String args[])throws Exception
    {
        int a,b;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a & b");
        a=Integer.parseInt(br.readLine());
        b=Integer.parseInt(br.readLine());
        if(a>b)
        {
            System.out.println("a is greater than b");
        }
        else
        {
            System.out.println("b is greater than a");
        }
    }
}
