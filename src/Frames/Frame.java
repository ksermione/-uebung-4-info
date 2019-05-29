package Frames;

/**
 * Created by oksana.shcherban on 29.05.19.
 */
public abstract class Frame {
    public FrameColor color;
    public Integer weight;

    public Frame(FrameColor color, Integer weight) {
        this.color = color;
        this.weight = weight;
    }
}
