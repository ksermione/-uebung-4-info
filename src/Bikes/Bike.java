package Bikes;

import Tires.Tire;
import Frames.Frame;
import GearShifts.GearShift;

/**
 * Created by oksana.shcherban on 29.05.19.
 */

public abstract class Bike {
    public Tire tires;
    public Frame frame;
    public GearShift gearShift;

    public Bike(Tire tires, Frame frame, GearShift gearShift) {
        this.tires = tires;
        this.frame = frame;
        this.gearShift = gearShift;
    }
}