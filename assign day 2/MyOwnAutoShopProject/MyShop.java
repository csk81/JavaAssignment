package MyOwnAutoShopProject;

public class MyShop {
    public static void main(String[] args) {
        Ford fordOne = new Ford(300, 300000, "blue", 2021, 35);
        Ford fordTwo = new Ford(250, 500000, "white", 2020, 40);
        Sedan sedan = new Sedan(200, 600000, "red", 30);
        Car car = new Car(1000, 100000, "black");
        System.out.println("Sedan "+sedan.getSalePrice());
        System.out.println("Fordone "+fordOne.getSalePrice());
        System.out.println("fordTwo "+fordTwo.getSalePrice());
        System.out.println("car  "+car.getSalePrice());
    }
}
