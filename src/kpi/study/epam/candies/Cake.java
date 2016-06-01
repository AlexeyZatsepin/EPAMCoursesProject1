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

public class Cake extends Sweetness{
    public boolean isSlised = false;
    public int pieceCount = 1;

    public Cake(Shape shape, int price, String label, Manufacturer manufacturer, Set<Ingridient> ingridients) {
        super(shape, price, label, manufacturer, ingridients);
    }

    @Override
    public void eatIt() {
        super.eatIt();
    }

    public boolean isSlised() {
        return isSlised;
    }

    public void setSlised(boolean slised) {
        isSlised = slised;
    }

    public int getPieceCount() {
        return pieceCount;
    }

    public void setPieceCount(int pieceCount) {
        this.pieceCount = pieceCount;
    }

    public void sliseIt(int count){
        setSlised(true);
        pieceCount *= count;
    }
}
