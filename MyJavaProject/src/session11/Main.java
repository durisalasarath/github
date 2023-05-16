package session11;

public class Main {

    public static void main(String[] args) {

        int i = 4;
        final int k = 3;

      //  i = 5;
       // k = 9;
        // cannot change the value of final variables
    }
}

class Animal {

    public void makeSound() {
        System.out.println("Animal making sound");
    }

    public final void run() {
        System.out.println("Animal running");
    }
}

class Dog extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Dog barking");
    }

   // @Override
   // public final void run() {
        // cannot override final methods
  //  }
}

final class Employee {

}

//class Person extends Employee {
    // You cannot extend final classes
//}