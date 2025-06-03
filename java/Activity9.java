package Activities;

import java.util.ArrayList;

public class Activity9 {
    public static void main(String[] args) {
        // Create an ArrayList of type String
        ArrayList<String> myList = new ArrayList<>();

        // Add 5 names to the ArrayList
        myList.add("Alice");
        myList.add("Bob");
        myList.add("Charlie");
        myList.add("David");
        myList.add("Eve");

        // Print all names using a for loop
        System.out.println("All names in the list:");
        for (String name : myList) {
            System.out.println(name);
        }

        // Retrieve the 3rd name using get() method (index starts from 0)
        String thirdName = myList.get(2);
        System.out.println("\nThe 3rd name in the list is: " + thirdName);

        // Use contains() method to check if a name exists
        String nameToCheck = "David";
        if (myList.contains(nameToCheck)) {
            System.out.println("\n" + nameToCheck + " exists in the list.");
        } else {
            System.out.println("\n" + nameToCheck + " does not exist in the list.");
        }

        // Use size() method to print the number of names
        System.out.println("\nNumber of names in the list: " + myList.size());

        // Use remove() method to remove a name from the list
        myList.remove("Charlie");
        System.out.println("After removing 'Charlie', size of the list: " + myList.size());
    }
}
