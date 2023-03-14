package shapes;

import java.util.logging.Logger;

public class Triangle implements calculations{
    private final double base,height,side;
    Logger log = Logger.getLogger("calculation");
    public Triangle(double base, double height, double side) {
        this.base = base;
        this.height = height;
        this.side = side;
    }

    public double perimeter()
    {
        return (base +height+side);
    }
    public double area()
    {
        return (0.5 *base *height);
    }
}
