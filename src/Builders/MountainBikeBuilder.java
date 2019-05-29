package Builders;

import Bikes.*;
import Tires.*;
import Frames.*;
import GearShifts.*;

/**
 * Created by oksana.shcherban on 29.05.19.
 */

public class MountainBikeBuilder implements iBikeBuilder {

    public Bike buildBike() {
        return new MountainBike(buildTires(), buildFrame(), buildGearShift());
    }

    public Tire buildTires() {
        return new RacerBikeTire(TireSize.MEDIUM, 10);
    }

    public Frame buildFrame() {
        return new RacerBikeFrame(FrameColor.BLUE, 20);
    }

    public GearShift buildGearShift() {
        return new RacerBikeGearShift(6);
    }
}