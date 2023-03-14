package shapecalculation;

import java.util.logging.Logger;
public class Calculation{
    private final Logger log = Logger.getLogger("calculation");
    protected double base,side,length,width,radius;
    protected float height;
    public Calculation(double base, float height, double side)
    {
        this.base=base;
        this.height=height;
        this.side=side;
        log.info("Triangle created successfully.");
    }
    public Calculation(double length, double width)
    {
        this.length=length;
        this.width=width;
        log.info("Rectangle created successfully.");
    }
    public Calculation(double radius)
    {
        this.radius=radius;
        log.info("Circle created successfully.");
    }
}
