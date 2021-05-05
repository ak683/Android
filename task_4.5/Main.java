/*
Создать абстрактный класс Animal с характеристиками животного.
Создать класс Horse который наследуется от Animal, в классе Horse
реализовать метод public void run(){ System.out.println("Игого, я поскакал(а)"); }
Создать класс Pegasus который наследуется от Horse, в классе Pegasus
реализовать метод public void fly(){ System.out.println("Игого, я полетел(а)"); }
Создать объект лошади и вызвать метод run();
Создать объект пегаса и вызвать метод fly();
*/

public class Main{
    public static void main(String[] args) {
        //Ваш код
        Horse poni = new Horse("Poni", "white", 2, "poni");
        poni.run();
        Pegasus letun = new Pegasus("Letun", "black", 3, "pegasus", true);
        letun.fly();
    }
}
abstract class Animal {
    String name;
    String color;
    public int age;

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }
}

class Horse extends Animal{
    String breed;

    public Horse(String name, String color, int age, String breed) {
        super(name, color, age);
        this.breed=breed;
    }
    public void run() {System.out.println("Игого, я поскакал(а)"); }
}
class Pegasus extends Horse {
    boolean wings;
    public Pegasus(String name, String color, int age, String breed, boolean wings) {
        super(name, color, age, breed);
        this.wings=wings;
    }
    public void fly() {System.out.println("Игого, я полетел(а)"); }
