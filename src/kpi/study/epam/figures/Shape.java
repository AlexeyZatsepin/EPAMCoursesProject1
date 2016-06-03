package kpi.study.epam.figures;

/**
 * EPAM_Project1_NewYearSurprises
 * Created 6/1/16, with IntelliJ IDEA
 *
 * @author Alex
 */
public abstract class Shape {
    public double square(){
        return 0.0;
    }
    public double perimeter(){
        return 0.0;
    }

    public abstract double volume();

    @Override
    public String toString() {
        return " volume: " + volume() + " shape: " + getClass().getSimpleName();
    }
}
