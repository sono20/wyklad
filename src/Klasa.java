import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Klasa {

    private static final List<Integer> numbers = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            printMenu();
            String command = scanner.nextLine();

            switch (command) {
                case "add":
                    System.out.print("Podaj liczbę: ");
                    numbers.add(Integer.parseInt(scanner.nextLine()));
                    break;

                case "removeEven":
                    removeEvenNumbers();
                    break;

                case "print":
                    printNumbers();
                    break;

                case "clear":
                    numbers.clear();
                    System.out.println("Lista wyczyszczona");
                    break;

                case "exit":
                    running = false;
                    break;

                default:
                    System.out.println("Nieznana komenda");
            }
        }

        scanner.close();
    }

    private static void printMenu() {
        System.out.println("\nKomendy:");
        System.out.println("add - dodaj liczbę");
        System.out.println("removeEven - usuń parzyste");
        System.out.println("print - wypisz");
        System.out.println("clear - wyczyść");
        System.out.println("exit - wyjście");
    }

    private static void removeEvenNumbers() {
        Iterator<Integer> iterator = numbers.iterator();

        while (iterator.hasNext()) {
            int value = iterator.next();
            if (value % 2 == 0) {
                iterator.remove();
            }
        }
    }

    private static void printNumbers() {
        if (numbers.isEmpty()) {
            System.out.println("Lista pusta");
            return;
        }

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
