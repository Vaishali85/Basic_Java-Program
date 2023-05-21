import java.io.*;
class Palin
{
    public static void main(String args[])
    {
        String n,rev="";
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter String ");
        n=Sc.nextLine();
       int length = n.length();
       for(int i=length-1;i>=0;i--)
       if(n.equals(rev))
        System.out.println("is palindrome:" );
        else
        System.out.println("not palindrome: ");
    }
}