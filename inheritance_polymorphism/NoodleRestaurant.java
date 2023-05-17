/*
 * A Java class can inherit fields and methods from another class.
 * Each Java class requires its own file, but only one class in a Java package needs a main() method.
 * Child classes inherit the parent constructor by default, but it’s possible to modify the constructor using super() or override it completely.
 * You can use protected and final to control child class access to parent class members.
 * Java’s OOP principle of polymorphism means you can use a child class object like a member of its parent class, but also give it its own traits.
 * You can override parent class methods in the child class, ideally using the @Override keyword.
 * It’s possible to use objects of different classes that share a parent class together in an array or ArrayList.
 * Child Classes in Method Parameters
*/


package inheritance_polymorphism;

class NoodleRestaurant {
    String name;
  
    public NoodleRestaurant(String customerName){
      name = customerName;
    }
  
    public void order(Noodle noodle) {
      System.out.println(noodle.getCookPrep());
      System.out.println("Order for " + name + " is ready.");
    }
  
    public static void main(String[] args) {
      Noodle ramen, pho;
      ramen = new Ramen();
      pho = new Pho();
      
      NoodleRestaurant customer1 = new NoodleRestaurant("Sagirah");
      NoodleRestaurant customer2 = new NoodleRestaurant("Maritza");
  
      // Add your code here
      customer1.order(pho);
      customer2.order(ramen);
  
  
  
  
    }
}