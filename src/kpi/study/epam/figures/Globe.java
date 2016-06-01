package kpi.study.epam.figures;

/**
 * EPAM_Project1_NewYearSurprises
 * Created 6/1/16, with IntelliJ IDEA
 *
 * @author Alex
 */
public class Globe extends Shape{
    double radius;

    public Globe(double radius) {
        this.radius = radius;
    }

    @Override
    public double volume() {
        return 4/3* Math.PI * radius;
    }
}
