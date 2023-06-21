public class Abstraction {
    public static void main(String[] args) {
    Dog dog = new Dog();
    Cat cat = new Cat();

    dog.sound();
    dog.sleep();

    cat.sound();
    cat.sleep();
    }
}

abstract class Animal{
    abstract void sound();
    void sleep(){
        System.out.println("Zzz Zzz");
    }

}

class Dog extends Animal{
    @Override
    void sound() {
        System.out.println("Woof Woof");
    }
}

class Cat extends Animal{
    @Override
    void sound() {
        System.out.println("Meow Meow");
    }
}

