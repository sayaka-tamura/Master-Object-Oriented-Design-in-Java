package section1;

public class Earth {

    public static void main(String[] args) {

        Human tom;
        tom = new Human("Tom Szabo", 5, 72, "brown");
        tom.speak();

        Human joe = new Human("Joe Greensilk", 36, 68, "green");
        joe.speak();
    }
}
