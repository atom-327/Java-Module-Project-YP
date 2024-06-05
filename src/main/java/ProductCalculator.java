import java.util.ArrayList;

class ProductCalculator {
    private ArrayList<Product> productList = new ArrayList<>();
    private double totalPrice;
    private double priceForEveryone;

    void addToProductList(String name, double price) {
        productList.add(new Product(name, price));
        totalPrice += price;
    }

    void printProductList() {
        System.out.println("Добавленные товары:");
        for (Product product : productList) {
            System.out.println(product.name);
        }
    }

    void printResultCheque(int countOfPeople) {
        Formatter formatter = new Formatter();
        priceForEveryone = totalPrice / countOfPeople;
        System.out.println(String.format("Общая сумма товаров: %.2f %s.", totalPrice, formatter.convert(totalPrice)));
        System.out.println(String.format("Каждый должен заплатить по %.2f %s.", priceForEveryone, formatter.convert(priceForEveryone)));
    }
}
