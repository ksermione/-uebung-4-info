package Tires;

/**
 * Created by oksana.shcherban on 29.05.19.
 */
public abstract class Tire {
    public TireSize size;
    public Integer width;

    public Tire(TireSize size, Integer width) {
        this.size = size;
        this.width = width;
    }
}