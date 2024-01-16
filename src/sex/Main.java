package sex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        personList.add(new Person("Krzysztof", 26, Gender.AGENDER));
        personList.add(new Person("Marcel", 54, Gender.MALE));
        personList.add(new Person("Marysia", 12, Gender.FEMALE));

        for(Person person : personList) {
            System.out.println(person);
        }
        System.out.println("-----------------------------------------");
        System.out.println("Wybierz płeć.");
        int i = 1;
        for(Gender gender : Gender.values()) {
            System.out.println(i + ") " + gender);
            i++;
        }
        int choice = scanner.nextInt();

        System.out.println("Wpisz wiek.");
        int wiek = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Wpisz imię.");
        String imie = scanner.nextLine();

        personList.add(new Person(imie, wiek, getGender(choice)));
        System.out.println("-----------------------------------------");
        for(Person person : personList) {
            System.out.println(person);
        }
        System.out.println("-----------------------------------------");

    }

    public static Gender getGender(int choice) {
        switch (choice) {
            case 1 -> {
                return Gender.MALE;
            }
            case 2 -> {
                return Gender.FEMALE;
            }
            case 3 -> {
                return Gender.AGENDER;
            }
            default -> {
                System.out.println("Nie ma takiej płci.");
                return null;
            }
        }
    }


}