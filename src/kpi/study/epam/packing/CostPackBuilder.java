package kpi.study.epam.packing;

import kpi.study.epam.candies.Packable;
import kpi.study.epam.candies.Sweetness;
import kpi.study.epam.figures.Shape;

import java.util.ArrayList;
import java.util.List;

/**
 * EPAM_Project1_NewYearSurprises
 * Created 6/1/16, with IntelliJ IDEA
 *
 * @author Alex
 */
public class CostPackBuilder extends PackageBuilder{
    // max cost of pack
    private int maxCost;

    public CostPackBuilder(Shape shape, List<Sweetness> sweets,int maxCost) {
        super(shape, sweets);
        this.maxCost = maxCost;
    }

    @Override
    public void buildShape() {
        pack.setShape(shape);
    }

    @Override
    public void buildLabel() {
        pack.setLabel("New Year package for "+ pack.getTotalPrice());

    }

    public int getMaxCost() {
        return maxCost;
    }

    public void setMaxCost(int maxCost) {
        this.maxCost = maxCost;
    }

    /**
     * build by size and cost
     */
    @Override
    public void buildSweets() {
        double sweetsVolume = 0.0;
        double totalPrice = 0.0;
        List<Sweetness> result = new ArrayList<>();
        while ((shape.volume()>sweetsVolume)&(maxCost>totalPrice)) {
            for (Sweetness candy : sweets) {
                if ((candy instanceof Packable)&(shape.volume() > sweetsVolume)&(maxCost>totalPrice)) {
                    sweetsVolume += candy.getShape().volume();
                    totalPrice += candy.getPrice();
                    result.add(candy);
                }
            }
        }
        pack.setSweets(result);
    }
}
