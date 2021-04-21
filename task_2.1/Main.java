public class Main {
    public static void main(String[] args) {
        String s[] = {"Мама","Мыла","Раму"};
        for (int i = 0; i<3; i++)
            for (int j = 0; j<3; j++)
                if (i!=j)   System.out.println(s[i] + s[j] + s[3-i-j]);

    }
}
