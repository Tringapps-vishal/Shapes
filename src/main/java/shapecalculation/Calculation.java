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
    public double perimeter(double base, double height, double side)
    {
        return (base +height+side);
    }
    public double perimeter(double length, double width)
    {
        return (2*(length+width));
    }
    public double perimeter(double radius)
    {
        return (2*3.14115*radius);
    }
    public double area(double base, float height)
    {
        return (0.5 *base *height);
    }
    public double area(double length, double width)
    {
        return (length*width);
    }
    public double area(double radius)
    {
        return (3.14115* radius * radius);
    }
}
