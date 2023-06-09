package arrays;
/*
Throughout the lesson, we have learned about:

    - Creating arrays explicitly, using { and }.
    - Accessing an index of an array using [ and ].
    - Creating empty arrays of a certain size, and filling the indices one by one.
    - Getting the length of an array using length.
    - Using the argument array args that is passed into the main() method of a class.
*/


// a classroom class

// import Arrays module
import java.util.Arrays;

public class Classroom {

  
    public static void main(String[] args){
        String[] students = {"Sade", "Alexus", "Sam", "Koma"};
        double[] mathScores = new double[4];
        mathScores[0] = 94.5;
        mathScores[2] = 76.8;

        System.out.println("The number of students in the class is "+ students.length);

        System.out.println("This is a classroom where "+ args[0] + " is taught!");

        System.out.println(Arrays.toString(students));
    
    }
}