package shapes;

import java.util.logging.Logger;

public class Rectangle implements calculations {
    private final double length,width;
    Logger log = Logger.getLogger("calculation");
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double perimeter()
    {
        return (2*(length+width));
    }
    public double area()
    {
        return (length*width);
    }
}
