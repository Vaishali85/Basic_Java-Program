import java.io.*;

class reverse
{
public static void main(String args[])throws Exception
{
int a,rev=0,rem=0;
BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
a=Integer.parseInt(br.readLine());
while(a>0)
{
rem=a%10;
rev=rev*10+rem;
a=a/10;
}
System.out.println("reverse is " +a);
}
}

