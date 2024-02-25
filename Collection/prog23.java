import java.io.*;
class prog23
{
    public static void main(String args[])throws IOException
    {
        int n=Integer.parseInt(args[0]);
        int array[];
        array=new int[n];
        System.out.println("Enter" +n+ "elements");
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<n;i++)
        array[i]=Integer.parseInt(br.readLine());
        System.out.println("array elements are");
        for(int i=0;i<n;i++)
        System.out.println(array[i]+ "\t");
        int sum=0;
        for(int i=0;i<n;i++)
        sum=sum+array[i];
        System.out.println("sum of array elements is"+sum);
    }
}