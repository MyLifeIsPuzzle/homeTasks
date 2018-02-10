package homeTaskTen;

public class GarageDemo {

    public static void main(String[] args) {
        Garage garage = new Garage();
        Car audiR8 = new AudiR8();
        Car audiR8Black = new AudiR8("Black");
        Car mercedesS500 = new MercedesS500();
        Car mercedesS500V6 = new MercedesS500(6);
        Car chevroletCorvetteGrandSport = new ChevroletCorvetteGrandSport();
        Car chevroletWithoutRoofRemoving = new ChevroletCorvetteGrandSport(false);
        Car lexusLX570 = new LexusLX570();
        Car lexusRedWithOneMoreSeat = new LexusLX570(6, "Red");

        garage.withdrawCar(audiR8);

        garage.parkCar(audiR8);
        garage.parkCar(audiR8);
        garage.parkCar(audiR8);
        garage.parkCar(audiR8Black);
        garage.parkCar(audiR8Black);
        garage.parkCar(mercedesS500);
        garage.parkCar(mercedesS500V6);
        garage.parkCar(chevroletCorvetteGrandSport);
        garage.parkCar(chevroletWithoutRoofRemoving);
        garage.parkCar(lexusLX570);
        garage.parkCar(lexusRedWithOneMoreSeat);

        garage.withdrawCar(audiR8Black);
        garage.withdrawCar(audiR8Black);
        garage.withdrawCar(audiR8Black);

        garage.showAmountOfCarsThisType(audiR8Black);
        garage.showAmountOfCarsThisType(chevroletCorvetteGrandSport);
    }
}