import java.io.*;
import java.math.*;
class Shape
{
    void area(int r)
    {
        double a;
        a=3.14*r*r;
        System.out.println("Area of circle=" +a);
    }
    void area(int l, int b)
    {
        float a;
        a=l*b;
        System.out.println("Area of Reactangle" +a);

    }
    void area(int l, int b,int h)
    {
        float a;
        a=l*b*h;
        System.out.println("Area of polygon"+a);

    }
}

class prog42
{
    public static void main(String args[])throws Exception
    {
        System.out.println("Enter radius:");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int r=Integer.parseInt(br.readLine());
        Shape s =new Shape();
        s.area(r);
        System.out.println("Enter length & breath of rectangle:");
        int l= Integer.parseInt(br.readLine());
        int b=Integer.parseInt(br.readLine());
        s.area(l,b);
        System.out.println("Enter height for polygon:");
        int h=Integer.parseInt(br.readLine());
        s.area(l,b,h);

    }
}