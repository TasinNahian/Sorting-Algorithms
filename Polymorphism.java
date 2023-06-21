public class Polymorphism {
    public static void main(String[] args) {
        Animals animals = new Animals();
        Dogs animals2 = new Dogs();
        Animals animals3 = new Cats();

        animals.sound();
        animals2.sound();
        animals3.sound();
    }
}

class Animals{
    void sound(){
        System.out.println("Animal making sound");
    }
}
class Dogs extends Animals{
    void sound(){
        System.out.println("Dog barks");
    }
}
class Cats extends Animals{
    void sound() {
        System.out.println("Cat meows");;
    }
}
