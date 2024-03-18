class Animal {
    void makeSound() {
        System.out.println("Some generic sound");
    }
    
    void makeSound(String specificSound) {
        System.out.println(specificSound);
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Woof");
    }
    
    void makeSound(int frequency) {
        System.out.println("Woof at frequency: " + frequency);
    }
}

public class overriding_loading {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();

        // Method overloading example
        animal.makeSound();  // Some generic sound
        animal.makeSound("Meow");  // Meow

        dog.makeSound();  // Woof
        dog.makeSound(100);  // Woof at frequency: 100
        
        // Method overriding example
        animal = new Dog(); // Polymorphism
        animal.makeSound(); // Woof
    }
}