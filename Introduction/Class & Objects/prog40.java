import java.io.*;

class time
{
    int HH;
    int MM;
    int SS;
    void accepttime(int h,int m,int s)
    {
        HH=h;
        MM=m;
        SS=s;
    }
    void printtime()
    {
        System.out.println(Time: +HH ":" +Time: +MM ":" +Time: +SS);

    }
}

class prog40
{
    public static void main(String args[])
    {
        time t1=new time();
        t1.accepttime(10,45,35);
        t1.printtime();
        time t2=new time();
        t2.accepttime(12,35,42);
        t2.printtime();
    }
}