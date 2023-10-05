import java.io.*;
class prog7
{
    public static void main(String args[])throws Exception
    {
        int a,b;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a & b");
        a=Integer.parseInt(br.readLine());
        b=Integer.parseInt(br.readLine());
        System.out.println("Before swapping a=" +a+ "b=" +b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping a=" +a+ "b=" +b);

    }
}