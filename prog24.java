import java.io.*;
class prog24
{
    public static void main(String args[])throws Exception
    {
        int n=Integer.parseInt(args[1]);
        int array[];
        array=new int[n];
        System.out.println("Enter" +n+ "elements");
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<n;i++)
        array[i]=Integer.parseInt(br.readLine());
        System.out.println("Array elements are:");
        for(int i=0;i<n;i++)
        System.out.println(array[i]+"\t");
        int sum=0;
        for(int i=0;i<n;i++)
        sum=sum+array[i];
        float average =sum/n;
        System.out.println("Average of the array elements is:"+average);
    }
}