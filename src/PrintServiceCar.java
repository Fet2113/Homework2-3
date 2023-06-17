public class PrintServiceCar implements PrintServiceNew {
    @Override
    public void print(Transport[] transports) {
    }

    public void printCar(Car[] cars) {
        for (int i = 0; i < cars.length; i++) {
            Car car = cars[i];
            System.out.println("Авто " + car.getModelName()
                    + " Колеса" + car.getWheelsCount());
        }
    }
}
