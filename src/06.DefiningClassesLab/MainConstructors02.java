package DefiningClassesLab06;

import java.util.Scanner;

public class MainConstructors02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0) {
            String[] data = scanner.nextLine().split("\\s+");
            String brand = data[0];

            Constructors02 car;

            if (data.length == 1) {
                car = new Constructors02(brand);
            } else {
                String model = data[1];
                int horsePower = Integer.parseInt(data[2]);
                car = new Constructors02(brand, model, horsePower);
            }
            System.out.println(car.getInfo());
        }
    }
}
