package section1;

public abstract class Animal {

    private int age;

    private String gender;

    private int weightInLbs;

    public Animal(int age, String gender, int weightInLbs) {
        this.age = age;
        this.gender = gender;
        this.weightInLbs = weightInLbs;
    }

    public void eat() {
        System.out.println("nomnomnom");
    }

    public void sleep() {
        System.out.println("Zzz...");
    }

    public abstract void move();
}
