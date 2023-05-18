// Debugging:

/*
 * Compile Errors
 * Run-time Errors
 * Exceptions
 * Exception Handling
 * Logic Errors - Test Driven Developement
 * Debugging Techniques - Divide & Conquer your code, Print statements for the rescue
*/

package debugging;


public class Debug {

    public static void main(String[] args) {

  
        try {
            int width = 0;
            int length = 40;
            int ratio = length / width;

            System.out.println(ratio);

        } catch (ArithmeticException e) {

            System.err.println("ArithmeticException: " + e.getMessage());
        }
      
          
    }
    
}

