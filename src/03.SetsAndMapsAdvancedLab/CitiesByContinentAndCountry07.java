package SetsAndMapsAdvancedLab03;

import java.util.*;
/*Write a program to read continents, countries, and their cities put them on a nested map,
        and print them in the order of their first appearance*/

public class CitiesByContinentAndCountry07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, LinkedHashMap<String, ArrayList<String>>>
                continentsData = new LinkedHashMap<>();

        while (n -- > 0) {
            String[] token = scanner.nextLine().split("\\s+");
            String continent = token[0];
            String country = token[1];
            String city = token[2];
            // добавяме континента ако го няма все още и създавам new LinkedHashMap<>()) за страните
            continentsData.putIfAbsent(continent, new LinkedHashMap<>());
            // достъпваме LinkedHashMap<>() със страните
            LinkedHashMap<String, ArrayList<String>> countries = continentsData.get(continent);
            //ако за първи път срещаме дадената страна я добавяме
            countries.putIfAbsent(country, new ArrayList<>());
            //достъпваме LinkedHashSet<>() със градовете
            ArrayList<String> cities = countries.get(country);
            cities.add(city);
        }

        for (var entry : continentsData.entrySet()) {
            System.out.println(entry.getKey() + ":");
            for (var innerEntry : entry.getValue().entrySet()) {
                String country = innerEntry.getKey();
                String cities = String.join(", ", innerEntry.getValue());
                System.out.printf("  %s -> %s\n", country, cities);
            }
        }
    }
}
