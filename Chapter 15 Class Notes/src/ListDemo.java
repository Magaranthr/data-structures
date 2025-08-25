import java.util.LinkedList;
import java.util.ListIterator;

/**
 * This program demonstrates the LinkedList class
 * and ListIterator class.
*/
public class ListDemo
{
    public static void main(String[] args)
    {
    LinkedList<String> staff = new LinkedList<>();
    
        staff.addLast("Tony");
        staff.addLast("Natasha");
        staff.addLast("Peter");

        staff.addFirst("Dchollilia");
        System.out.println(staff);
        
        ListIterator<String> iterator = staff.listIterator();
        iterator.next();
        iterator.add("Steve");
        System.out.println(staff);
    
    
    
    
    
    
    
    }
}
