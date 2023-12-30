import java.io.*;
class date
{
    int dd;
    int mm;
    int yyyy;
}
class prog34
{
    public static void main(String args[])throws IOException
    {
        int dd, mm, yyyy;
        date d1=new date();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter date:");
        dd=Integer.parseInt(br.readLine());
        System.out.println("Enter month:");
        mm=Integer.parseInt(br.readLine());
        System.out.println("Enter year:");
        yyyy=Integer.parseInt(br.readLine());
        System.out.println(d1.dd+ "-" +d1.mm+"-" +d1.yyyy);
    }
}