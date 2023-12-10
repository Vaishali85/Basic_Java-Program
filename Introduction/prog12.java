import java.io.*;

class prog12{
    public static void main(String args[])throws Exception{
    int a,rem, sum=0, temp=0;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter number a:");
    a= Integer.parseInt(br.readLine());

    temp=a;
    while(a>0){
        rem=a%10;
        sum=(sum*10)+rem;
        a=a/10;
    }
    if (sum==temp)
    System.out.println("Number is palindrome.");
    else
    System.out.println("Number is not palindrome.");
    }
    }
    