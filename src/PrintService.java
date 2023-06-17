public class PrintService implements PrintServiceNew {
    @Override
    public void print(Transport[] transports) {
        ServiceStation station = new ServiceStation();
        for (int i = 0; i < transports.length; i++) {
            station.check1(transports[i]);
        }

    }
    public void printCar (Car[]cars){
        for (int i = 0; i < cars.length; i++) {
            Car car = cars[i];
            System.out.println("Авто " + car.getModelName()
                    + "NNN " + car.getWheelsCount());
        }
    }
}


