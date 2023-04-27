/*

Java is an object-oriented programming language where every program has at least one class. 

Programs are often built from many classes and objects, which are the instances of a class.

*/

// Classes are modeled on the real-world things we want to represent in our programs.

// Classes define the state and behavior of their instances (objects).



// A simple Dog program
public class Dog {


    // instance fields - state
    String breed;
    boolean hasOwner;
    int age;
    
    // constructor method - behavior
    public Dog(String dogBreed, boolean dogOwned, int dogYears) {

        System.out.println("Constructor invoked!");
        breed = dogBreed;
        hasOwner = dogOwned;
        age = dogYears;
    }

    // main method - behavior
    public static void main(String[] args) {
        System.out.println("Main method started");
        System.out.println("");

        Dog fido = new Dog("poodle", false, 4);
        Dog nunzio = new Dog("shiba inu", true, 12);
        boolean isFidoOlder = fido.age > nunzio.age;
        int totalDogYears = nunzio.age + fido.age;

        // output
        System.out.println("");
        System.out.println("Two dogs created: a " + fido.breed + " and a " + nunzio.breed);
        System.out.println("The statement that fido is an older dog is: " + isFidoOlder);
        System.out.println("The total age of the dogs is: " + totalDogYears);

        System.out.println("");
        System.out.println("");
        System.out.println("Main method finished");
    }
}