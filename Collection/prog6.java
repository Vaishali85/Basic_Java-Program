import java.util.*;
class prog6
{
    public static void main(String args[])
    {
        Vector v =new Vector();
        v.add("Sunday");
        v.add("Monday");
        v.add("Tuesday");
        v.add("Wendsday");
        v.add("Thursday");
        v.add("Friday");
        v.add("Saturday");
        Enumeration e=v.elements();
        while(e.hasMoreElements())
        {
            System.out.println(e.nextElement());
        }
    }
}