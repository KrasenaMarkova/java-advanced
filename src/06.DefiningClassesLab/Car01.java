package DefiningClassesLab06;

public class Car01 {
    private String brand;
    private String model;
    private int horsePower;

    public void setBrand(String _brand) {
        brand = _brand;
    }

    public void setModel(String _model) {
        model = _model;
    }

    public void setHorsepower(int _horsePower) {
        horsePower = _horsePower;
    }

    public String getInfo() {
        return String.format("The car is: %s %s - %d HP.",brand, model, horsePower);
    }
}
