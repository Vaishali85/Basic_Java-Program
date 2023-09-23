import java.util.*;
class prog12
{
    public static void main(String args[])
    {
        ArrayList al = new ArrayList(); //      or      ArrayList<String> al = new ArrayList<String>();

        al.add("Nashik");
        al.add("Pune");
        al.add("Mumbai");
        al.add("Hydrabai");
        System.out.println(al);
        Iterator i =al.iterator(); 
        while (i.hasNext());
        {
            System.out.println("I Live in "+i.next());
        }
        ListIterator li = al.listIterator();
        while(li.hasNext())
        {
            li.next();
        }
        while(li.hasPrevious())
        {
            System.out.println("I don't live in "+li.previous());
        }
    }
}