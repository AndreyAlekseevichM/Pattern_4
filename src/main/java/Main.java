import java.util.Scanner;

public class Main {
    //Magic Numbers Principle -  использую константы
    public static final String monetaryUnits = "руб.";


    public static void main(String[] args) {
        //Liskov substitution principle - наследники класса Product
        Product[] products = {new Bread(), new Milk(), new Cup()};
        //DRY - повторяющийся вывод списка продуктов вынесен в отдельный метод
        showProucts(products);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите номер товара и количество через пробел или введите `end` для завершения");
            String input = scanner.nextLine();
            if ("end".equals(input)) break;
            String[] parts = input.split(" ");
            int productNumber = Integer.parseInt(parts[0]) - 1;
            products[productNumber].setCount(Integer.parseInt(parts[1]));
        }
        showProucts(products);
        printBasket(products);
    }

    private static void showProucts(Product[] products) {
        System.out.println("Список товаров:");
        for (int i = 0; i < products.length; i++) {
            System.out.println((i + 1) + ". " + products[i]);
        }
    }

    private static void printBasket(Product[] products) {
        int sumProducts = 0;
        System.out.println("Ваша корзина:");
        for (Product product : products) {
            if (product.getCount() != 0) {
                sumProducts += product.getCount() * product.getPrice();
                System.out.println(product + ", количество= " + product.getCount() + " шт."
                        + ", цена= " + product.getPrice() + " " + monetaryUnits
                        + ", стоимость= " + product.getCount() * product.getPrice() + " " + monetaryUnits);
            }
        }
        System.out.println("Итого: " + sumProducts + " " + monetaryUnits);
    }
}