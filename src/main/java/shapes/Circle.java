package shapes;

import java.util.logging.Logger;

public class Circle implements calculations{
    private final double radius;
    Logger log = Logger.getLogger("calculation");
    public Circle(double radius) {
        this.radius = radius;
    }

    public double perimeter()
    {
        return (2*3.14115*radius);
    }
    public double area()
    {
        return (3.14115* radius * radius);
    }
}
