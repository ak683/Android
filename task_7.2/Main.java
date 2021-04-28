import java.io.*;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;

/*
 * task_7.1 - реализовать многопоточность в прокси чеккере первым и вторым способом
 * task_7.2 - рабочие ip адреса необходимо складывать в файл good.txt
 *  */

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";   // цвета

    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("C:\\java\\ip.txt"); // путь к файлу
            int i;
            String proxy = "";
            while ((i=fin.read()) != -1){
                if(i==13) continue;  // 13 - возврат каретки
                else if(i==10){   //10 - перенос строки
                    String ip = proxy.split(":")[0];  // разрезаем строку по ":", берем начало
                    String port=proxy.split(":")[1];  // разрезаем строку по ":", берем конец
                    Thread thread = new Thread(new Runnable() {
                        @Override
                        public void run() {
                            System.out.println(checkProxy(ip,Integer.parseInt(port)));//чекпрокси вызывается и сразу печатает в консоль
                        }
                    });
                    thread.start();

                    try {
                        FileOutputStream fout = new FileOutputStream("C:\\java\\good.txt");

                        byte[] bytes = ip.getBytes();
                        fout.write(bytes);
                        fout.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }




                    proxy ="";  //обнулили строку
                }else if(i != 9){
                    proxy += (char)i; // 9 - табуляция
                }else{
                    proxy += ":";
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        /*try {
            FileOutputStream fout = new FileOutputStream("C:\\java\\test.txt");
            String text = "Hello!";
            byte[] bytes = text.getBytes(StandardCharsets.UTF_8);
            fout.write(bytes);
            fout.close();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
    }

    public static String checkProxy(String ip, int port){
        try {  // трай - а вдруг интернета не будет
            Proxy proxy = new Proxy(Proxy.Type.HTTP,new InetSocketAddress(ip, port));
            URLConnection urlConnection = new URL("https://vozhzhaev.ru/test.php").openConnection(proxy);
            InputStream is = urlConnection.getInputStream();  //стрим - поток
            InputStreamReader reader = new InputStreamReader(is); //считывает поток
            int rc;
            StringBuilder sb = new StringBuilder();//стрингбилдер - строчка, которую можно менять; sb - строчка
            while ((rc = reader.read()) != -1){
                sb.append((char)rc);
            }
            return "IP: "+ip+":"+port+ANSI_GREEN+" работает"+ANSI_RESET;//подключение состоялось, айпи рабочий
        } catch (Exception e) {
            return "IP: "+ip+":"+port+ANSI_RED+" не работает"+ANSI_RESET;//если ошибка,то возвр. не работает
        }
    }
}
