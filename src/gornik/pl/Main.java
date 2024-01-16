package gornik.pl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Shape> shapeList = new ArrayList<>();
        Shape shape = new Shape("Circle", Color.RED);
        Shape shape1 = new Shape("Square", Color.BLACK);
        Shape shape2 = new Shape("Triangle", Color.BLUE);
        Shape shape3 = new Shape("Hexagon", Color.WHITE);

        shapeList.add(shape);
        shapeList.add(shape1);
        shapeList.add(shape2);
        shapeList.add(shape3);

        for (Shape value : shapeList) {
            System.out.println(value.toString());
        }

        System.out.println("Wprowadź typ kształtu.");
        String typ = scanner.nextLine();
        System.out.println("Wprowadź kolor kształtu: Czarny, Biały, Czerwony, Niebieski, Zielony");
        String kolor = scanner.nextLine();
        Color color = getColor(kolor);

        shapeList.add(new Shape("romb", color));

        if(color != null) {
            shapeList.add(new Shape("romb", color));
        } else {

        }

        for (Shape value : shapeList) {
            System.out.println(value.toString());
        }
    }

    public static Color getColor(String color) {
        Color color1;
        switch(color) {
            case "czerwony" -> {
                return Color.RED;
            }
            case "niebieski" -> {
                return Color.BLUE;
            }
            case "zielony" -> {
                return Color.GREEN;
            }
            case "czarny" -> {
                return Color.BLACK;
            }
            case "biały" -> {
                return Color.WHITE;
            }
            default -> {
                System.out.println("Nie ma takiego koloru, wybierz kolor z listy");
                return null;
            }
        }
    }
}
