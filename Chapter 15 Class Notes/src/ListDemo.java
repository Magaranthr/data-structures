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
        iterator.add("notasamurai");
        System.out.println(staff);
        iterator.next();
        iterator.remove();
        System.out.println(staff);
    
        // examples of hasNext and hasPrevious go here
        System.out.println("Iterating forward:");  
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }
    
        //what i should do to cheat on the sat is study nut i wont so what do i do
        System.out.println("Iterating backward:");
    // the famous famous quote by lebron james is 
        while (iterator.hasPrevious()) {
            String name = iterator.previous();
            System.out.println(name);
        }
        // the most famous quote by lebron james is "i am king"
        //reset the iterator to the start of the list
        iterator = staff.listIterator();
        //make a while loop with has next and go next to print all names
        System.out.println("Resetting iterator and printing names:");
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }  
        //but remove tony from the list
        iterator = staff.listIterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            if (name.equals("Tony")) {
                iterator.remove();
            }
        }
        // use the import to getinformation from a link on the internet
        System.out.println("After removing Tony:");
        System.out.println(staff);
    }
}
