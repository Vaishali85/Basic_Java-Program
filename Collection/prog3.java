import java.util.*;
import java.io.*;
class prog3
{
    public static void main(String args[])
    {
        Vector v= new Vector(5,3);
        System.out.println("capacity:"+v.capacity());
        System.out.println("size:"+v.size());
        v.add("A");
        v.add("B");
        v.add("C");
        v.add("D");
        v.add("E");
        System.out.println("capacity:"+v.capacity());
        System.out.println("size:"+v.size());
        System.out.println(v);
        v.add("F");
        System.out.println("capacity:"+v.capacity());
        System.out.println("size:"+v.size());
        System.out.println(v);
    }
}