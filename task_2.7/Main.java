public class Main {
    public static void main(String[] args) {
        int a = 31;
        int counter = 0;
        for (int i = 2; i < a; i = i + 1) {
            if (a % i == 0) counter +=1;

        }
        if (counter!= 0) System.out.println("true");
        else System.out.println("false");
    }

}
