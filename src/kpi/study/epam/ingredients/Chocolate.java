package kpi.study.epam.ingredients;

/**
 * EPAM_Project1_NewYearSurprises
 * Created 6/1/16, with IntelliJ IDEA
 *
 * @author Alex
 */
public class Chocolate extends Ingridient {
    private Sort sort;

    public Chocolate(double weight, Sort sort) {
        super(weight*0.05, weight*0.3, weight*0.65, Type.sweet);
        this.sort = sort;
    }

    public Sort getSort() {
        return sort;
    }

    public void setSort(Sort sort) {
        this.sort = sort;
    }

    public enum Sort{
        WHITE,BLACK,MILK
    }
}
