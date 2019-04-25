package section3.builderPattern;

public class Vehicle {

    private String type;

    private String manufacturer;

    private String model;

    private double price;

    private int doors;

    private String color;

    private int horsePower;

    private Vehicle(Builder builder) {
        this.type = builder.type;
        this.manufacturer = builder.manufacturer;
        this.model = builder.model;
        this.price = builder.price;
        this.doors = builder.doors;
        this.color = builder.color;
        this.horsePower = builder.horsePower;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "type='" + type + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", doors=" + doors +
                ", color='" + color + '\'' +
                ", horsePower=" + horsePower +
                '}';
    }

    public static class Builder {

        private String type;

        private String manufacturer;

        private String model;

        private double price;

        private int doors;

        private String color;

        private int horsePower;

        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public Builder manufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
            return this;
        }

        public Builder model(String model) {
            this.model = model;
            return this;
        }

        public Builder price(double price) {
            this.price = price;
            return this;
        }

        public Builder doors(int doors) {
            this.doors = doors;
            return this;
        }

        public Builder color(String color) {
            this.color = color;
            return this;
        }

        public Builder horsePower(int horsePower) {
            this.horsePower = horsePower;
            return this;
        }

        public Vehicle build() {
            return new Vehicle(this);
        }
    }
}
