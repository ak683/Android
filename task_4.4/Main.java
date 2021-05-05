/*
Создай классы Dog, Cat, Mouse.
Добавь по три поля в каждый класс, на твой выбор.
Создай объекты для героев мультика Том и Джерри.
Так много, как только вспомнишь.
Пример:
Mouse jerryMouse = new Mouse("Jerry", 12 , 5),
где 12 - высота в см,
5 - длина хвоста в см.
Требования:
•	Создай класс Dog.
•	Создай класс Cat.
•	В классе Dog должно быть три переменные.
•	В классе Cat должно быть три переменные.
•	Должен быть создан хотя бы один объект типа Mouse.
•	Должен быть создан хотя бы один объект типа Dog.
•	Должен быть создан хотя бы один объект типа Cat.
*/

public class Main {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);
        Cat Tom = new Cat("Tom", 3, 10);
        Dog Rex = new Dog("Rex", 5, 7);

    }
}
class Mouse {
    String name;
    int height;
    int tail;

    public Mouse(String name, int height, int tail) {
        this.name = name;
        this.height = height;
        this.tail = tail;
    }
}
class Cat {
    String name;  // имя
    int age;      // возраст
    int impudence; // наглость

    public Cat(String name, int age, int impudence) {
        this.name = name;
        this.age = age;
        this.impudence = impudence;
    }
}

class Dog {
    String name;  // имя
    int age;      // возраст
    int angry;    // злость

    public Dog(String name, int age, int angry) {
        this.name = name;
        this.age = age;
        this.angry = angry;
    }
}
