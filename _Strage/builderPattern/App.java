package section3.builderPattern;

public class App {

    public static void main(String[] args) {

        User websiteUser = new User.Builder("bobMax", "bobmax@gmail.com").firstName("Bob").lastName("Max").build();
        System.out.println(websiteUser);

        Vehicle car = new Vehicle.Builder().price(10300.76).type("car").manufacturer("Honda").horsePower(150).model("Accord").color("red").doors(4).build();
        System.out.println(car);
    }
}
