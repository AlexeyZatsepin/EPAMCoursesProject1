package kpi.study.epam.candies;

import kpi.study.epam.figures.Shape;
import kpi.study.epam.ingredients.Ingridient;

import java.util.Set;

/**
 * EPAM_Project1_NewYearSurprises
 * Created 6/1/16, with IntelliJ IDEA
 *
 * @author Alex
 */

public class Candy extends Sweetness implements Packable{ // candy , you can eat, you can pack
    private boolean canBeSingle = true;

    public Candy(Shape shape, int price, String label, Manufacturer manufacturer, Set<Ingridient> ingridients, boolean canBeSingle) {
        super(shape, price, label, manufacturer, ingridients);
        this.canBeSingle = canBeSingle;
    }

    public boolean isCanBeSingle() {
        return canBeSingle;
    }

    public void setCanBeSingle(boolean canBeSingle) {
        this.canBeSingle = canBeSingle;
    }


}
