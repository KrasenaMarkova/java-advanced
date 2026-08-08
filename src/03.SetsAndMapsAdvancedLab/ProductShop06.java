package SetsAndMapsAdvancedLab03;

import java.util.*;
/*Write a program that prints information about food shops in Sofia and the products they store.
        Until the "Revision" command you will receive an input in the format: "{shop}, {product}, {price}".
        Keep in mind that if you get a store that already exists, you must gather product information.
        Your output must be ordered by shop name and must be in the format:
        "{shop}->
        Product: {product}, Price: {price}"
        The price should be formatted to one digit after the decimal point.*/

public class ProductShop06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, Map<String, Double>> shopsInformation = new TreeMap<>();

        while (!input.equals("Revision")) {
            String[] partOfInput = input.split(", ");
            String shop = partOfInput[0];
            String product = partOfInput[1];
            double price = Double.parseDouble(partOfInput[2]);

            shopsInformation.putIfAbsent(shop, new LinkedHashMap<>());
            shopsInformation.get(shop).putIfAbsent(product, price);

            input = scanner.nextLine();
        }

        for (Map.Entry<String, Map<String, Double>> entryShop : shopsInformation.entrySet()) {
            System.out.println(entryShop.getKey() + "->");
            for (Map.Entry<String, Double> entryProduct : entryShop.getValue().entrySet()) {
                System.out.println("Product: " + entryProduct.getKey() + ", Price: "
                                    + String.format("%.1f",entryProduct.getValue()));
            }
        }
    }
}
