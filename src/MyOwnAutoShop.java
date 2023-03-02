public class MyOwnAutoShop {
    public static void main(String[] args) {
        Sedan sedan = new Sedan(120, 20000, "red", 15);

        Ford ford1 = new Ford(100, 30000, "blue", 2010, 5000);
        Ford ford2 = new Ford(90, 25000, "green", 2015, 4000);

        Car car = new Car(80, 15000, "black");

        System.out.println("Sale price of Sedan: $" + sedan.getSalePrice());
        System.out.println("Sale price of Ford 1: $" + ford1.getSalePrice());
        System.out.println("Sale price of Ford 2: $" + ford2.getSalePrice());
        System.out.println("Sale price of Car: $" + car.getSalePrice());
    }
}
