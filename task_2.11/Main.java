public class Main {
    public static void main(String[] args) {
        int [] numbers = {10, 2, 3, 3, 4, 4, 5};

        int sum =numbers[0];
        int i = 1;
        while (sum <=10) {
            sum = sum + numbers[i];
            i++;
        }
        System.out.println(i);
    }
}
