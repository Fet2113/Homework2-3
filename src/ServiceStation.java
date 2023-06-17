public class ServiceStation {

    public void check1(Transport transport) {
        System.out.println("Обслуживаем " + transport.getModelName());
        System.out.println();
        for (int i = 0; i < transport.getWheelsCount(); i++) {
            transport.updateTyre();

        }
        if (transport instanceof Car) {
            ((Car) transport).checkEngine();
        }
        if (transport instanceof Truck) {
            ((Truck) transport).checkEngine();
            ((Truck) transport).checkTrailer();
        }

    }
}
