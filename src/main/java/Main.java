import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static ProductCalculator calculator;
    static int countOfPeople;
    static final String STOPWORD = "Завершить";

    public static void main(String[] args) {
        System.out.println("Введите количество человек, на которое необходимо разделить счет:");
        while (scanner.hasNext()) {
            if (!scanner.hasNextInt()) {
                System.out.println("Ввод должен быть целым числом.");
                scanner.nextLine();
            } else {
                countOfPeople = scanner.nextInt();
                if (countOfPeople <= 1) {
                    System.out.println("Количество человек должно быть больше одного.");
                    scanner.nextLine();
                } else {
                    calculator = new ProductCalculator();
                    scanner.nextLine();
                    break;
                }
            }
        }

        do {
            System.out.println("Введите название товара:");
            String name = scanner.nextLine();
            System.out.println("Введите цену товара:");
            double price;
            while (scanner.hasNext()) {
                if (!scanner.hasNextDouble() || scanner.hasNextInt()) {
                    System.out.println("Ввод должен быть дробным числом.");
                    scanner.nextLine();
                } else {
                    price = scanner.nextDouble();
                    if (price < 0) {
                        System.out.println("Цена не может быть отрицательной.");
                        scanner.nextLine();
                    } else {
                        calculator.addToProductList(name, price);
                        System.out.println("Товар успешно добавлен в список!");
                        break;
                    }
                }
            }
            System.out.println("Введите любой символ, чтобы продолжить добавление к списку товаров.\nДля выхода из программы введите \"Завершить\".");
            scanner.nextLine();
        } while (!scanner.nextLine().equalsIgnoreCase(STOPWORD));

        calculator.printProductList();
        calculator.printResultCheque(countOfPeople);
        scanner.close();
    }
}
