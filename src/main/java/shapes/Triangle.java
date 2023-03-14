package shapes;

public class Triangle implements Calculations{
    private final double base;
            double height;
            double side;
    public Triangle(double base, double height, double side) {
        this.base = base;
        this.height = height;
        this.side = side;
    }

    public double perimeter()
    {
        return (this.base +this.height+this.side);
    }
    public double area()
    {
        return (0.5 *this.base *this.height);
    }
}
