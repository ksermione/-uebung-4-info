package Builders;

import Bikes.Bike;
import Tires.Tire;
import Frames.Frame;
import GearShifts.GearShift;

/**
 * Created by oksana.shcherban on 29.05.19.
 */
public interface iBikeBuilder {
    public Bike buildBike();
    Tire buildTires();
    Frame buildFrame();
    GearShift buildGearShift();
}
