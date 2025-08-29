import java.util.LinkedList;
import java.util.ListIterator;

/**
 * This class supplies a utility method to reverse the entries in a linked list.
*/
public class ListUtil
{
    /**
     * Reverses the elements in a linked list
     *
     * @param strings the linked list to reverse
    */
    public static void reverse(LinkedList<String> strings)
    {
        int len=strings.size();
        ListIterator <String> b=strings.listIterator(strings.size());
        ListIterator <String> f=strings.listIterator();
        for (int i = 0; i < len / 2; i++) {
            String front = f.next();
            String back = b.previous();

            // Swap the elements
            f.set(back);
            b.set(front);
        }
    }
}