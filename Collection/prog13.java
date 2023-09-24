import java.util.*;
class prog13
{
    public static void main(String args[])
    {
        HashMap hm= new HashMap();
        
        hm.put("1","AAA");
        hm.put("2","BBB");
        hm.put("3","CCC");
        hm.put("4","DDD");
        Set s =hm.entrySet();
        Iterator i =s.iterator();
        while(i.hasNext())
        {
            Map.Entry me=(Map.Entry)i.next();
            System.out.println(me.getKey()+ "\t" + me.getValue());
        }
    }
}