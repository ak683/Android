public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("Бобик");
        System.out.println(dog.getName());
        dog.setAge(2);
        System.out.println(dog.getAge());

    }
}

    class Dog {
    private String name = "безымянный пёсик";

    public java.lang.String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    private int age = 0;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }




}
