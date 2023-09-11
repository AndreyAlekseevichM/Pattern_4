public class Cup extends Product implements Dishes, Clean {
    //Interface Segregation Principle - разделил большой интерфейс на маленькие
    //Dependency Inversion Principle - разделив интерфейсы можно менять функционал по необходимости

    private final String name = "Стакан";
    private final int price = 70;

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void use() {
        System.out.println("Стакан наполнен");
    }

    @Override
    public void wash() {
        System.out.println("Стакан помыт");
    }
}