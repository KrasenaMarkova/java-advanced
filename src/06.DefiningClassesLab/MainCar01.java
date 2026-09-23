package DefiningClassesLab06;

import java.util.Scanner;

public class MainCar01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0) {
            String[] data = scanner.nextLine().split("\\s+");
            String brand = data[0];
            String model = data[1];
            int horsePower = Integer.parseInt(data[2]);

            Car01 car = new Car01();

            car.setBrand(brand);
            car.setModel(model);
            car.setHorsepower(horsePower);

            System.out.println(car.getInfo());
        }


    }
}
