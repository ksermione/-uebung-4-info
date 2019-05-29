import Bikes.Bike;
import Bikes.BikeType;

/**
 * Created by oksana.shcherban on 29.05.19.
 */
public class Main {

    public static void main(String[] args) {
        BikeDirector bikeDirector = new BikeDirector();

        Bike mountainBike = bikeDirector.getBike(BikeType.MOUNTAINBIKE);
        Bike racerBike = bikeDirector.getBike(BikeType.RACER);

        printBikeDescription(mountainBike, BikeType.MOUNTAINBIKE);
        printBikeDescription(racerBike, BikeType.RACER);
    }

    private static void printBikeDescription(Bike bike, BikeType type) {
        System.out.print("Your new " + type + " has:\nTire width: " + bike.tires.width
                + "\nTire size: " + bike.tires.size
                + "\nFrame weight: " + bike.frame.weight
                + "\nFrame color: " + bike.frame.color
                + "\nGear shift count: " + bike.gearShift.count + "\n");
    }

}
