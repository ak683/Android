import java.util.Scanner;
public class Main {


        public static void main(String[] agrs) {
                int[] a = new int[10];
                int i = 0;
                Scanner in = new Scanner(System.in);


                for (int element : a) {

                        System.out.print("Введите " + (i + 1) + "-й элемент массива: ");
                        a[i] = in.nextInt();

                        System.out.println(a[i] + " - ");

                        i++;
                }

                int s1 = 1;
                int max = 0;
                for(int j = 1; j < 10; j++) {
                        if(a[j]==a[j-1])
                                s1++;

                                if (s1>max) max=s1;


                                else s1 = 1;

                }
                         System.out.println(max);



        }
}
