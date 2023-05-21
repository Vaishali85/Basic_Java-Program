import java.io.*;

class swap
{
public static void main(String args[])throws Exception
{
int a,b;
BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter a:");//5
a=Integer.parseInt(br.readLine());
System.out.println("Enter b:");//6
b=Integer.parseInt(br.readLine());
a=a+b;//11
b=a-b;//11-6=5
a=a-b;//11-5=6
System.out.println("swap is " +a);
}
}

