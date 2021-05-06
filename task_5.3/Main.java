/*
 * Задание: Дана коллекция с числами. Запишите в новую коллекцию только
 * те числа, которые больше нуля и меньше 10-ти.
 * Коллекции вы создаёте сами
 */

import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList();
        ArrayList<Integer> numbers1 = new ArrayList();
        numbers.add(1);
        numbers.add(10);
        numbers.add(100);
        numbers.add(-1);
        numbers.add(5);

        for (int i:numbers){
           if (0<i && i<10) numbers1.add(i);

        }
        System.out.println(numbers1);

    }
}
