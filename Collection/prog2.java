import java.io.*;
import java.util.*;
class prog2
{
    public static void main(String args[])
    {
        LinkedList ll=new LinkedList();
        System.out.println(ll);
        System.out.println("size:"+ll.size());
        System.out.println(ll);
        ll.add("ABC");
        ll.add("lmn");
        ll.add("xyx");
        System.out.println(ll.size());
        System.out.println(ll);
        ll.remove("lmn");
        ll.addFirst("123");
        ll.addLast("pqr");
        System.out.println(ll.size());
        System.out.println(ll);
        ll.removeFirst();
        System.out.println("First Element is:"+ll.getFirst());

    }
}