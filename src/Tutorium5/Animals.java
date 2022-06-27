package Tutorium5;

public abstract class Animals {

    public static void main(String[] args) {
        Animals[] animals = {new Dog("Max"), new Cat(), new Bird()};

        for(Animals animal : animals) {
            animal.makeNoise();
            if(animal instanceof Dog) {
                System.out.println(((Dog) animal).name);
            }
        }

    }

    public abstract void makeNoise();

}

class Dog extends Animals {

    String name;

    Dog(String name) {
        this.name = name;
    }

    public void makeNoise() {
        System.out.println("Wuff Wuff");
    }

}

class Cat extends Animals {

    public void makeNoise() {
        System.out.println("Meow Meow");
    }

}

class Bird extends Animals {

    public void makeNoise() {
        System.out.println("Chirp Chirp");
    }

}