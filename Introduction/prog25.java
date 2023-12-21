import java.io.*;
class prog25
{
    public static void main(String args[])throws IOException
    {
        int i=0;
        int n =Integer.parseInt(args[1]);
        int array[];
        array=new int[n];
        System.out.println("Enter"+n+"element");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        for(i=0; i<n; i++)
        array[i]=Integer.parseInt(br.readLine());
        System.out.println("Array Element are:");
        for(i=0; i<n; i++)
        System.out.println(array[i]+"\t");
        int max=array[i];
        for(i=0; i<n; i++)
        if(array[i]>max)
        max=array[i];
        System.out.println("max="+max);
    }
}