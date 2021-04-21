public class Main {
    public static void main(String[] args) {
        int [] numbers = {2, 3, 4, 5};
        int counter = 0;
        for (int i = 0; i < numbers.length; i = i + 1) {
            if (numbers[i]==5)  counter++;

        }
        if (counter == 0) System.out.println("нет");
        else System.out.println("да");

    }

}
