import java.io.*;
class prog27
{
    public static void main(String args[])throws IOException
    {
        int i,j;
        int array[][];
        array=new int[3][3];
        System.out.println("Enter array Element");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        for(i=0; i<3; i++)
        for(j=0; j<3; j++)
        array[i][j]=Integer.parseInt(br.readLine());
        System.out.println("Array elements are:");
        for(i=0; i<3; i++)
        {
        for(j=0; j<3; j++)
        {
            System.out.println("array[i][j]"+"\t");
        }
        System.out.println(" ");
        }
    }
}