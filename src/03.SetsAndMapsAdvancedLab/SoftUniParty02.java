package SetsAndMapsAdvancedLab03;

import java.util.Scanner;
import java.util.TreeSet;
/*There is a party in SoftUni. Many guests are invited, and they are two types: VIP and regular.
        When a guest comes, you have to check if he/she exists on any of the two reservation lists.
        All reservation numbers will be with 8 chars. All VIP numbers start with a digit.
        There will be 2 command lines:
        •	First is "PARTY" - the party is on, and guests are coming.
        •	The second is "END" - then the party is over, and no more guests will come.
        The output shows all guests who didn't come to the party (VIP must be first).*/

public class SoftUniParty02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        /* тъй като vip резервациите започват с число, а в аscii таблицата числата са преди буквите, запазваме
        в един TreeSet всички резервации и накрая при отпечатването първо ще са vip резервациите и след тях
        ще се разпечатат regular

        TreeSet<String> reservations = new TreeSet<>();
        while (!input.equals("PARTY")) {
            String reservation = input;
            reservations.add(reservation);
            input = scanner.nextLine();
        }
        input = scanner.nextLine();
        while (!input.equals("END")) {
            String reservation = input;
            reservations.remove(reservation);
            input = scanner.nextLine();
        }
        System.out.println(reservations.size());
        for (String reservation : reservations) {
            System.out.println(reservation);
        }*/
        TreeSet<String> vip = new TreeSet<>();
        TreeSet<String> regular = new TreeSet<>();

        while (!input.equals("PARTY")) {
            String reservation = input;

            //ако резервацията започва с елемент на 0 индекс е число
            if (Character.isDigit(reservation.charAt(0))) {
                vip.add(reservation);
            } else {
                regular.add(reservation);
            }
            input = scanner.nextLine();
        }

        input = scanner.nextLine();

        while (!input.equals("END")) {
            String reservation = input;
            
         /* можем да направим същата проверка и да премахмен въведената резервация,(по този начин
         проверката трябва да се изнесе в метод, тъй като го повтаряме), но може и без проверка,
            тъй като всяка една резервация я има само в един от двата сета*/
            vip.remove(reservation);
            regular.remove(reservation);

             input = scanner.nextLine();
        }
        System.out.println(vip.size() + regular.size());

        for (String reservation : vip) {
            System.out.println(reservation);
        }

        for (String reservation : regular) {
            System.out.println(reservation);
        }
    }
}
