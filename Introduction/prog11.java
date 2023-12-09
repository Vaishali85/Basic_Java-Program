import java.io.*;

class prog11{
    public static void main(String args[]) throws Exception {
        int a,rem=0,digit=0,sum=0;
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Enter a");
        a = Integer.parseInt(br.readLine());
        
        while(a>0){
            rem=a%10;
            sum=rem+sum;
            a=a/10;
            digit=digit+1;

        System.out.println("Sum of digit of number=" +sum);

        }
    }
}        