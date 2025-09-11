import java.util.Scanner;
import java.util.*;
/**
 * A program to add, remove, modify or print
 * student names and grades.
*/
public class Gradebook
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        Map<String, String> grades = new HashMap<>();

        boolean done = false;
        while(!done)
        {
            System.out.println("A)dd R)emove M)odify P)rint Q)uit");
            String input = in.next().toUpperCase();
            if (input.equals("Q"))
            {
                done = true;
            } else if (input.equals("A"))
            {
                System.out.println("Enter name: ");
                in.nextLine();
                String nameAdd = in.nextLine();
                System.out.println("Enter grade: ");
                String gradeAdd = in.nextLine();
                grades.put(nameAdd, gradeAdd);

            } else if (input.equals("R"))
            {
                System.out.println("Enter name: ");
                in.nextLine();
                String nameRemove = in.nextLine();
                grades.remove(nameRemove);
            } else if (input.equals("M"))
            {
                System.out.println("Enter name: ");
                in.nextLine();
                String nameAdd = in.nextLine();
                System.out.println("Enter new grade: ");
                String gradeAdd = in.nextLine();
                grades.put(nameAdd, gradeAdd);
            } else if (input.equalsIgnoreCase("P"))
            {
                for (String name : grades.keySet())
                {
                    System.out.println(name + ": " + grades.get(name));
                }
            } else
            {
                done = true;
            }
        }
    }
}
