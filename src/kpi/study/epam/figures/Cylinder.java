package kpi.study.epam.figures;

/**
 * EPAM_Project1_NewYearSurprises
 * Created 6/1/16, with IntelliJ IDEA
 *
 * @author Alex
 */
public class Cylinder extends Shape {
    private double radius;
    private double hight;

    public Cylinder(double radius, double hight) {
        this.radius = radius;
        this.hight = hight;
    }

    @Override
    public double volume() {
        return Math.PI*radius*radius*hight;
    }

}
