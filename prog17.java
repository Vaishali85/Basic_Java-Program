import java.io.*;
class prog17
{
    public static void main(String args[])
    {
        int x=20;
        int z;
        System.out.println("x=" +x);
        {
            int y=10;
            z=x+y;
            System.out.println("y=" +y);
        }
        //y=100;
        System.out.println("z=" +z);
    }
}