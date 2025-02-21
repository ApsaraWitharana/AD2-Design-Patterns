

public class Main {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();

        Car audi = carFactory.createCar(CarType.AUDI);
        Car mustang = carFactory.createCar(CarType.MUSTANG);
        Car gtr = carFactory.createCar(CarType.GTR);
        Car lambo = carFactory.createCar(CarType.LAMBO);
        Car civic = carFactory.createCar(CarType.CIVIC);

        System.out.println(audi.getDetails());
        System.out.println(mustang.getDetails());
        System.out.println(gtr.getDetails());
        System.out.println(lambo.getDetails());
        System.out.println(civic.getDetails());
    }
}
