package Builders;

import Bikes.*;
import Tires.*;
import Frames.*;
import GearShifts.*;

/**
 * Created by oksana.shcherban on 29.05.19.
 */

public class RacerBuilder implements iBikeBuilder {

    public Bike buildBike() {
        return new RacerBike(buildTires(), buildFrame(), buildGearShift());
    }

    public Tire buildTires() {
        return new RacerBikeTire(TireSize.SMALL, 5);
    }

    public Frame buildFrame() {
        return new RacerBikeFrame(FrameColor.RED, 15);
    }

    public GearShift buildGearShift() {
        return new RacerBikeGearShift(8);
    }
}
