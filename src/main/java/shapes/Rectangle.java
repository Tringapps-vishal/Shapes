package shapes;

public class Rectangle implements Calculations {
    private final double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double perimeter()
    {
        return (2*(this.length+this.width));
    }
    public double area()
    {
        return (this.length*this.width);
    }
}
