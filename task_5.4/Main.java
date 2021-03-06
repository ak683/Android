/*
1. Ввести путь к файлу с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
-2
11
3
-5
2
10
Пример вывода:
-2
2
8
10
*/



import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException, NullPointerException
    {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String read = reader.readLine();
        InputStream inStream = new FileInputStream(read);
        ArrayList list = new ArrayList();           //список цифр, которые мы потом будем сортировать
        StringBuilder stringBuilder = new StringBuilder();          //для пришивания
        while(inStream.available() > 0)         //вызываем по одному байту из файла
        {
            int data = inStream.read();         //читаем один байт
            char data1 = (char) data;           //переводим его в char
            stringBuilder.append(data1);
        }
        String a = (stringBuilder.toString());
        StringTokenizer st = new StringTokenizer(a, " \t\n\r,.");
        while (st.hasMoreTokens())
        {
            list.add(Integer.parseInt(st.nextToken()));
        }
        int[] array = new int[list.size()];
        int i = 0;
        for (Object text : list)
        {
            array[i] = (int) text;
            i++;
        }
        Arrays.sort(array);
        for (i = 0; i < array.length; i++)
        {
            if (array[i] % 2 == 0)
            {
                System.out.println(array[i]);
            }
        }
        reader.close();
        inStream.close();
    }
}
