package shapes;

public class Rectangle implements calculations {
    public double perimeter()
    {
        return (2*(length+width));
    }
    public double area()
    {
        return (length*width);
    }
}
