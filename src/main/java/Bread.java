public class Bread extends Product implements Food {
    //Open-Closed principle - имплементируя интерфейс Food добавляем новую функциональность  не меняя исходные классы
    private final String name = "Хлеб";
    private final int price = 30;

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void take() {
        System.out.println("Хлеб взят");
    }
}