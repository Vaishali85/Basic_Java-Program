import java.io.*;
class prog22{
    public static void main(String args[])throws Exception
    {
        int i=0;
        int n=Integer.parseInt(args[0]);
        int array[];
        array = new int[n];
        System.out.println("Enter"+n+"elements");
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        for(i=0; i<n; i++)
        array[i]=Integer.parseInt(br.readLine());
        System.out.println("Array elements are:");
        for(i=0; i<n; i++)
        System.out.println(array[i]+ "\t");
    }
}