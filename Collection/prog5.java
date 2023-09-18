import java.util.*;
class prog5
{
     static void showpush(Stack s, int a)
    {
        s.push(new Integer(a));
        System.out.println("push("+a+")");
        System.out.println("Stack"+s);

    }
    static void showpop(Stack s)
    {
        System.out.println("pop->");
        Integer a =(Integer)s.pop();
        System.out.println(a);
        System.out.println("Stack"+s);
    }
    public static void main(String args[])
    {
        Stack s = new Stack();
        System.out.println("Stack"+s);
        showpush(s,35);
        showpush(s,25);
        showpush(s,15);
        showpush(s,5);
        showpop(s);
        showpop(s);
        showpop(s);
        showpop(s);
        try
        {
            showpop(s);
        }
        catch(EmptyStackException e)
        {
            System.out.println("Stack is already empty");
        }
    }
}