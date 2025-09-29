import java.util.PriorityQueue;
import java.util.Scanner;
/**
 * Implement a to do list. Tasks have a priority between 
 * 1 and 9 (with 1 being most urgent), and a description.
 * When the user enters the command 'add priority description', 
 * the program adds a new task. When the user enters next, 
 * the program removes and prints the most urgent task. 
 * The quit command quits the program. 
 * Use a priority queue in your solution.
*/
public class ToDoList
{
    // Instance variable(s)
    PriorityQueue<Task> tasks;


    /**
     * Constructor
    */

    public ToDoList()
    {
        tasks  = new PriorityQueue<Task>();
        
    }

    /**
     * Display a menu and accepts commands.
     */
    public void run()
    {
        String option = "";
        System.out.println("To Do List - Please enter an option");
        System.out.println("     add priority description (add a new task)");
        System.out.println("     next (remove and print most urgent task)");
        System.out.println("     quit (exit this program)");
        System.out.println();
        
        Scanner in = new Scanner(System.in);
        
        do
        {
            System.out.print("> ");
            option = in.nextLine();
            if (option.startsWith("add"))
            {
                addTask(option);
            } else if (option.equals("next"))
            {
                nextTask();
            }
        } 
        while (! option.equals("quit"));
    }
    
    /**
     * Parse the add option line.
     *
     * @param optionStr the option line
    */
    public void addTask(String optionStr)
    {
        // Parse input after the "add" command. Expected format: "add <priority> <description>"
        if (optionStr == null) {
            System.out.println("The priority must be an integer between 1 and 9.");
            return;
        }

        // Remove the leading "add" and trim
        String rest = optionStr.length() >= 3 ? optionStr.substring(3).trim() : "";
        if (rest.isEmpty()) {
            System.out.println("The priority must be an integer between 1 and 9.");
            return;
        }

        // Split into priority token and the rest (description)
        String[] parts = rest.split("\\s+", 2);
        String prioStr = parts[0];

        // Validate priority is a single digit between 1 and 9
        if (prioStr.length() != 1 || !Character.isDigit(prioStr.charAt(0))) {
            System.out.println("The priority must be an integer between 1 and 9.");
            return;
        }

        int priority = prioStr.charAt(0) - '0';
        if (priority < 1 || priority > 9) {
            System.out.println("The priority must be an integer between 1 and 9.");
            return;
        }

        String description = parts.length > 1 ? parts[1].trim() : "";
        Task task = new Task(priority, description);
        tasks.add(task);
    }

    /**
     * Get the next highest priority task and
     * display the description to the user.
    */
    public void nextTask()
    {
        // Remove and print the next task (most urgent). If the queue is empty, do nothing.
        if (tasks.isEmpty()) {
            return;
        }

        Task next = tasks.remove();
        System.out.println(next.getDescription());
    }
}