package kpi.study.epam.ingredients;

/**
 * EPAM_Project1_NewYearSurprises
 * Created 6/1/16, with IntelliJ IDEA
 *
 * @author Alex
 */
//Marmelad
public class Jujube extends Ingridient{
    public Color color;

    public Jujube(double weight, Color color) {
        super(weight*0.18, 0, weight*0.82, Type.sweet);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public enum Color{
        RED,GREEN,BLUE,ORANGE
    }
}
