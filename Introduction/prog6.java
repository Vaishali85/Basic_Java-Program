import java.io.*;
class prog6
{
    public static void main(String args[])throws Exception
{
   int a,b;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter a & b");
    a=Integer.parseInt(br.readLine());
    b=Integer.parseInt(br.readLine());
    int c=a+b;
    System.out.println("Addition ="+c);
}
}