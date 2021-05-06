/*
Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
Новая задача: Программа должна работать не с номерами домов, а с городами:
Пример ввода:
Москва
Ивановы
Киев
Петровы
Лондон
Абрамовичи

Лондон
Пример вывода:
Абрамовичи */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Map;
import java.util.HashMap;


public class Main {
    public static void main(String[] args) throws IOException {
        Map<String, String> addresses = new HashMap<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String family;
        String city;

        while (true) {
            city = reader.readLine();
            if (city.isEmpty()) break;
            family = reader.readLine();


            addresses.put(city, family);

        }
        String myCity = reader.readLine();
        for (Map.Entry<String, String> town : addresses.entrySet()) {
            String town_i = town.getKey();
            if (myCity.equals(town_i)) {
                System.out.println(town.getValue());
            }
        }
    }
}
