import java.util.Stack;
import java.util.Scanner;

/**
 * Class for simulating a driveway and a street, using stacks
 * of cars with license plate numbers as representation.
*/
public class Driveway
{
    /**
      * Stack representing the cars in the driveway.
    */

    private Stack<Integer> driveway;
    /**
      * Stack representing the cars in the street.
    */
    private Stack<Integer> street;

    /**
      * Constructor.
    */

    public Driveway()
    {
        // Complete the constructor
        
        street=new Stack<Integer>();
        driveway=new Stack<Integer>();

    }

    /**
      * Add the given license plate to the driveway.
      *
      * @param licensePlate number of license plate.
    */
    public void add(int licensePlate)
    {
        // Complete this method
        driveway.push(licensePlate);


    }

    /**
      * Remove the given license plate from the driveway.
      *
      * @param licensePlate number of license plate.
    */
    public void remove(int licensePlate)
    {
        // Complete this method

    boolean found = false;
    while (!driveway.isEmpty()) {
        int car = driveway.pop();
        if (car == licensePlate) {
            found = true;
            break;
        } else {
            street.push(car);
        }
    }

    if (!found) {
        System.out.println("Car with license plate " + licensePlate + " not found in driveway.");
    }

    while (!street.isEmpty()) {
        driveway.push(street.pop());
    }
}

    /**
      * Prints the driveway and street details to the screen.
    */
    public void print()
    {
         System.out.println("In Driveway, starting at first in (one license plate per line):");
    for (int i = 0; i < driveway.size(); i++) {
        System.out.println(driveway.get(i));
    }

    System.out.println("In Street, starting at first in (one license plate per line):");
    for (int i = 0; i < street.size(); i++) {
        System.out.println(street.get(i));
    }}
}
