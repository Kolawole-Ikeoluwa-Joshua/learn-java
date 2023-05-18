package arraylists;
/*
 * Creating an ArrayList.
 * Adding a new ArrayList item using add().
 * Accessing the size of an ArrayList using size().
 * Finding an item by index using get().
 * Changing the value of an ArrayList item using set().
 * Removing an item with a specific value using remove().
 * Retrieving the index of an item with a specific value using indexOf().
*/

// a Todo program

import java.util.ArrayList;

class ToDos {
  public static void main(String[] args) {
    
    // Sherlock
    ArrayList<String> sherlocksToDos = new ArrayList<String>();

    // Add to todo list
    
    sherlocksToDos.add("visit the crime scene");
    sherlocksToDos.add("play violin");
    sherlocksToDos.add("interview suspects");
    sherlocksToDos.add("listen to Dr. Watson for amusement");
    sherlocksToDos.add("solve the case");
    sherlocksToDos.add("apprehend the criminal");

    // Size of todo list
    System.out.println("TASKS TO COMPLETE");
    System.out.println(sherlocksToDos.size());
    System.out.println();

    // Get second todo item
    System.out.println("SECOND TASK TO COMPLETE");
    System.out.println(sherlocksToDos.get(1));
    System.out.println();
    
    // Update a todo item
    sherlocksToDos.set(2, "interview suspects & witnesses");
    System.out.println("UPDATED LIST");
    System.out.println(sherlocksToDos);
    System.out.println();

    // Remove from todo list
    
    sherlocksToDos.remove("visit the crime scene");
    System.out.println("REMOVE COMPLETED ITEM FROM LIST");
    System.out.println(sherlocksToDos);
    System.out.println();  
    
    // Calculate to-dos until case is solved:
    int taskLeft = sherlocksToDos.indexOf("solve the case");
  
    System.out.println("TASKS LEFT TO SOLVE CASE");
    System.out.println(taskLeft);

  }
  
}