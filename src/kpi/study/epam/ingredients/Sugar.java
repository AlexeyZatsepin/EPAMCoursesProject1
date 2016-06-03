package kpi.study.epam.ingredients;

/**
 * EPAM_Project1_NewYearSurprises
 * Created 6/1/16, with IntelliJ IDEA
 *
 * @author Alex
 */
public class Sugar extends Ingridient{
    private Kind kind;

    public Sugar(double weight, Kind kind) {
        super(0, 0, weight, Type.sweet);
        this.kind = kind;
    }

    public enum Kind{
        White,Brown
    }
}
