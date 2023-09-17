import java.util.*;
class prog4
{
    public static void main(String args[])
    {
        Stack s=new Stack();
        s.push(new Integer(5));
        s.push(new Integer(2));
        s.push(new Integer(10));
        s.push(new Integer(15));
        System.out.println("Element poped:"+s.pop());
        System.out.println("Element at top:"+s.peek());
    }
}