package DefiningClassesExercises06;

import java.util.List;

public class Car4 {
    private String model;
    private Engine4 engine;
    private Cargo4 cargo;
    private List<Tire4> tires;

    public Car4(String model, Engine4 engine, Cargo4 cargo, List<Tire4> tires) {
        this.model = model;
        this.engine = engine;
        this.cargo = cargo;
        this.tires = tires;
    }


    public void extract(String command) {
        switch (command) {
            case "fragile":
                for (Tire4 tire : tires) {
                    double pressure = tire.getPressure();
                    if (pressure < 1) {
                        System.out.println(model);
                        break;
                    }
                }
                break;
            case "flamable":
                if (engine.getEnginePower() > 250) {
                    System.out.println(model);

                }
                break;

        }
    }
}
