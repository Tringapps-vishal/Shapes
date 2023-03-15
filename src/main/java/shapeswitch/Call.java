package shapeswitch;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import shapes.*;

public class Call {
    Logger log=Logger.getLogger("Call");
    Scanner sc=new Scanner(System.in);
    public void triangle()
    {
        log.info("VALUES FOR TRIANGLE");
        log.info("Enter the base value:");
        double base = sc.nextInt();
        log.info("Enter the height value:");
        float height = sc.nextInt();
        log.info("Enter the side value:");
        double side = sc.nextInt();
        Triangle t = new Triangle(base, height, side);
        log.log(Level.INFO,()->"Perimeter of Triangle :" + t.perimeter());
        log.info("Area of Triangle :" + t.area());
    }
    public void rectangle()
    {
        log.info("VALUES FOR RECTANGLE");
        log.info("Enter the length value:");
        double length = sc.nextInt();
        log.info("Enter the width value:");
        double width = sc.nextInt();
        Rectangle r = new Rectangle(length, width);
        log.log(Level.INFO,()->"Perimeter of Rectangle :" + r.perimeter());
        log.info("Area of Rectangle :" + r.area());
    }
    public void circle()
    {
        log.info("VALUES FOR CIRCLE");
        log.info("Enter the radius value:");
        double radius = sc.nextInt();
        Circle c = new Circle(radius);
        log.log(Level.INFO,()->"Perimeter of Circle :" + c.perimeter());
        log.info("Area of Circle :" + c.area());
    }
}
