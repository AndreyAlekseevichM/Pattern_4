public class Milk extends Product implements Food {
    //Single-Responsibility principle - класс Milk описывает только молоко
    private final String name = "Молоко";
    private final int price = 50;

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
        System.out.println("Молоко взято");
    }
}
