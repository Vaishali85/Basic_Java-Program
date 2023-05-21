import java.io.*;

class P2
{
    public static void main(String args[])throws IOException
    {
        int a,b;
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter a and b :");
      a=Integer.parseInt(br.readLine());
      b=Integer.parseInt(br.readLine());
        if(a>b)
        System.out.println("a is max");
       else
        System.out.print("b is max");

        
    }
}