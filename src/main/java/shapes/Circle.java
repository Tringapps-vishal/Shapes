package shapes;

public class Circle implements calculations{
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double perimeter()
    {
        return (2*3.14115*this.radius);
    }
    public double area()
    {
        return (3.14115*this.radius * this.radius);
    }
}
