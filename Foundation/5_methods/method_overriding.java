

// Definition:
// Method overriding occurs when a child class provides its own implementation
// of a method that is already defined in the parent class.

class Animal {

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class method_overriding {

    public static void main(String[] args) {

        Dog d = new Dog();

        d.sound();
    }
}
