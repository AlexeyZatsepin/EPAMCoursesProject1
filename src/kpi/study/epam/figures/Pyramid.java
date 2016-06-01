package kpi.study.epam.figures;

/**
 * EPAM_Project1_NewYearSurprises
 * Created 6/1/16, with IntelliJ IDEA
 *
 * @author Alex
 */
public class Pyramid extends Shape{
    private double hight;
    private double a;
    private double b;
    private double c;

    public Pyramid(double hight, double a, double b, double c) {
        this.hight = hight;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double perimeter() {
        return a+b+c;
    }

    @Override
    public double volume() {
        double p = perimeter()/2;
        return (hight*Math.sqrt(p*(p-a)*(p-b)*(p-c)))/3;
    }
}
