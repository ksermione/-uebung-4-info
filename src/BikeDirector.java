import Bikes.Bike;
import Bikes.BikeType;
import Builders.MountainBikeBuilder;
import Builders.RacerBuilder;
import Builders.iBikeBuilder;

/**
 * Created by oksana.shcherban on 29.05.19.
 */
public class BikeDirector {

    BikeType bikeType;
    iBikeBuilder bikeBuilder;

    public Bike getBike(BikeType type) {

        if (bikeType != type) {
            switch (type) {
                case RACER:
                    bikeBuilder = new RacerBuilder();
                    break;
                case MOUNTAINBIKE:
                    this.bikeBuilder = new MountainBikeBuilder();
                    break;
            }
        }

        return bikeBuilder.buildBike();
    }
}
