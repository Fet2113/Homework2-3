public class Main {
    public static void main(String[] args) {
        Bicycle[] bicycles = new Bicycle[]{
                new Bicycle("bicycle1", 2),
                new Bicycle("bicycle2", 2),
        };
        Car[] cars = new Car[]{
                new Car("car1", 4),
                new Car("car2", 4),
        };
        Truck[] trucks = new Truck[]{
                new Truck("truck1", 6),
                new Truck("truck2", 8)
        };
        Transport[] transports = new Transport[bicycles.length + cars.length + trucks.length];
        for (int i = 0; i < bicycles.length; i++) {
            transports[i] = bicycles[i];
        }
        for (int i = 0; i < cars.length; i++) {
            transports[i + bicycles.length] = cars[i];
        }
        for (int i = 0; i < trucks.length; i++) {
            transports[i + bicycles.length + cars.length] = trucks[i];
        }

        PrintServiceNew printService = new PrintService();
        printService.print(transports);
        PrintServiceNew printServiceCar = new PrintServiceCar();
        printServiceCar.printCar(cars);
    }
}