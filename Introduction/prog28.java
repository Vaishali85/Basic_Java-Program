import java.io.*;
class prog28
{
    public static void main(String args[])throws IOException
    {
        int i,j;
        int A[][],B[][],C[][];
        A=new int[3][3];
        B=new int[3][3];
        C=new int[3][3];
        System.out.println("Enter 1st array element");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        for(i=0; i<3; i++)
        for(j=0; j<3; j++)
        A[i][j]=Integer.parseInt(br.readLine());
        System.out.println("Enter 2nd array element");
        for(i=0; i<3; i++)
        for(j=0; j<3; j++)
        B[i][j]=Integer.parseInt(br.readLine());
        for(i=0; i<3; i++)
        for(j=0; j<3; j++)
        C[i][j]=A[i][j]+B[i][j];
        for(i=0; i<3; i++)
        for(j=0; j<3; j++)
        System.out.println("Addition of 2 matrices:" +C[i][j]);
    }
}