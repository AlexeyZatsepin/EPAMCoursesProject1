package kpi.study.epam.figures;

/**
 * EPAM_Project1_NewYearSurprises
 * Created 6/1/16, with IntelliJ IDEA
 *
 * @author Alex
 */
public class Parallelepiped extends Shape {
    private int lenght;
    private int wight;
    private int hight;

    @Override
    public double volume() {
        return wight*lenght*hight;
    }

    public Parallelepiped(int lenght, int wight, int hight) {
        this.lenght = lenght;
        this.wight = wight;
        this.hight = hight;
    }
}
