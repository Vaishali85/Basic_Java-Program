import java.util.*;
class prog10
{
    public static void main(String args[])
    {
        PriorityQueue pq=new PriorityQueue();
        pq.offer("B");
        pq.offer("C");
        pq.offer("A");
        System.out.println(pq);
        System.out.println("Element at head: "+pq.peek());
        System.out.println("Element Removed: "+pq.poll());
        System.out.println(pq);
        
    }
}