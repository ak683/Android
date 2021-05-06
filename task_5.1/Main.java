/*
 * Дана коллекция имён.
 * 1) удалить все повторяющиеся имена из коллекции
 * 2) вывести коллекцию на экран
 * */
import java.util.Set;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashSet;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList();
        names.add("Анатолий");
        names.add("Георгий");
        names.add("Руслан");
        names.add("Георгий");
        names.add("Павел");
        names.add("Руслан");
        // помещаем  коллекцию в сет
        Set<String> set = new HashSet<>(names);

        // чистим  коллекцию
        names.clear();

     // помещаем из коллекции сета обратно в  коллекцию, которая на данный момент ещё пустая
        names.addAll(set);
        System.out.println(names);
    }
}
