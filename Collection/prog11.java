import java.util.*;
class prog11
{
    public static void main(String args[])
    {
        ArrayList al = new ArrayList();
        al.add("Nashik");
        al.add("Pune");
        al.add("Mumbai");
        al.add("Hydrabad");
        System.out.println(al);
        Iterator i=al.iterator();
        while(i.hasNext())
        {
            System.out.println("I live in " +i.next());
        }
    }
}