package kpi.study.epam.ingredients;

/**
 * EPAM_Project1_NewYearSurprises
 * Created 6/1/16, with IntelliJ IDEA
 *
 * @author Alex
 */
public class Dough extends Ingridient{
    public String title;

    public Dough(double weight, String title) {
        super(weight*0.33, weight*0.34, weight*0.33, Type.sweet);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
