interface Animal {
    void makeSound();
}

class Dog implements Animal {
    public void makeSound() {
        System.out.println("Dog says: Woof Woof");
    }
}

class Cat implements Animal {
    public void makeSound() {
        System.out.println("Cat says: Meow");
    }
}

class Cow implements Animal {
    public void makeSound() {
        System.out.println("Cow says: Moo");
    }
}

public class AnimalTest {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal cow = new Cow();

        dog.makeSound();
        cat.makeSound();
        cow.makeSound();
    }
}
