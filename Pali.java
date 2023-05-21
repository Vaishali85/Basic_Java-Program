import java.io.*;
class Pali
{
    public static void main(String args[])throws Exception
    {
       int r,sum=0 , temp;

    //BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
    //System.out.println("Enter no  ");
       // a= Integer.parseInt(br.readLine());
          int a=454;
           temp=a;
        while(a>0)
        {
            r=a%10;      
            sum=(sum*10)+r;
            a=a/10;
        }
        if(temp==sum)
        System.out.println("Given Num is palindrome number" );
        else
        System.out.println("Given num is not palindrome number: ");
    }
}