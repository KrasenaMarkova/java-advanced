package DefiningClassesLab06;

public class Constructors02 {
    private String brand;
    private String model;
    private int horsePower;

    public Constructors02(String brand, String model, int horsePower) {
        this.brand = brand;
        this.model = model;
        this.horsePower = horsePower;
    }
    public Constructors02(String brand) {
        this.brand = brand;
        this.model = "unknown";
        this.horsePower = -1;
    }

    public String getInfo() {
        return String.format("The car is: %s %s - %d HP.",brand, model, horsePower);
    }
}
