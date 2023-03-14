package shapeswitch;

import shapecalculation.Calculation;
import java.util.Scanner;
import java.util.logging.Logger;

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
        Calculation t = new Calculation(base, height, side);
        log.info("Perimeter of Triangle :" + t.perimeter(base, height, side));
        log.info("Area of Triangle :" + t.area(base,height));
    }
    public void rectangle()
    {
        log.info("VALUES FOR RECTANGLE");
        log.info("Enter the length value:");
        double length = sc.nextInt();
        log.info("Enter the width value:");
        double width = sc.nextInt();
        Calculation r = new Calculation(length, width);
        log.info("Perimeter of Rectangle :" + r.perimeter(length, width));
        log.info("Area of Rectangle :" + r.area(length, width));
    }
    public void circle()
    {
        log.info("VALUES FOR CIRCLE");
        log.info("Enter the radius value:");
        double radius = sc.nextInt();
        Calculation c = new Calculation(radius);
        log.info("Perimeter of Circle :" + c.perimeter(radius));
        log.info("Area of Circle :" + c.area(radius));
    }
}
