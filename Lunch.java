/* 
 * while loops: These are useful to repeat a code block an unknown number of times until some condition is met.
 * for loops: These are ideal for when you are incrementing or decrementing with a counter variable.
 * For-each loops: These make it simple to do something with each item in a list. 
*/

import java.util.ArrayList;

class Lunch {
 
  public static ArrayList<String> removeAnts(ArrayList<String> lunchBox) {
    // Add your code below
    for (int i = 0; i < lunchBox.size(); i++){
      if (lunchBox.get(i) == "ant"){
        lunchBox.remove(lunchBox.get(i));
        i--;
      }
     
    }
   
     return lunchBox;
  }
 
  
  public static void main(String[] args) {
    ArrayList<String> lunchContainer = new ArrayList<String>();
    lunchContainer.add("apple");
    lunchContainer.add("ant");
    lunchContainer.add("ant");
    lunchContainer.add("sandwich");
    lunchContainer.add("ant");
    lunchContainer = removeAnts(lunchContainer);
    System.out.println(lunchContainer);

  }
}