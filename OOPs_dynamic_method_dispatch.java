// Superclass
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass 1
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// Subclass 2
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

// Subclass 3
class Cow extends Animal {
    @Override
    void sound() {
        System.out.println("Cow moos");
    }
}


public class OOPs_dynamic_method_dispatch {
    public static void main(String[] args) {
        // Superclass reference holding subclass objects
        Animal myAnimal;

        // Reference is pointing to Dog object
        myAnimal = new Dog();
        myAnimal.sound(); // Outputs: Dog barks

        // Reference is pointing to Cat object
        myAnimal = new Cat();
        myAnimal.sound(); // Outputs: Cat meows

        // Reference is pointing to Cow object
        myAnimal = new Cow();
        myAnimal.sound(); // Outputs: Cow moos
    }
}
