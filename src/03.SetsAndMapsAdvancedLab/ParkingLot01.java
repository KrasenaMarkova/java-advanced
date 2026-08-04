package SetsAndMapsAdvancedLab03;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class ParkingLot01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        LinkedHashSet<String> parkingLot = new LinkedHashSet<>();

        while (!input.equalsIgnoreCase("END")) {

            //String registration = input.substring(input.lastIndexOf(" ")).trim();
            String[] inputInformation = input.split(",\\s+");
            String registration = inputInformation[1];

            if (input.contains("IN")) {
                parkingLot.add(registration);
            }else {
                parkingLot.remove(registration);
            }
            input = scanner.nextLine();
        }

        if (parkingLot.isEmpty()) {
            System.out.println("Parking Lot is Empty");
        } else {
            for (String string : parkingLot) {
                System.out.println(string);
            }
        }
        /* не работи вярно
        String output = parkingLot.isEmpty()
                ? "Parking Lot is Empty"
                : String.join(System.lineSeparator(), parkingLot); //lineSeparator() символа за нов ред

        System.out.println(parkingLot);*/
    }
}
