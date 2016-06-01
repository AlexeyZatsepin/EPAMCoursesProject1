package kpi.study.epam.packing;

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
public class Package { //Product
    private Shape shape;
    private String label;
    private List<Sweetness> sweets = new ArrayList<>();
    private double totalPrice = 0.0;


    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public List<Sweetness> getSweets() {
        return sweets;
    }

    public void setSweets(List<Sweetness> sweets) {
        if (this.sweets.isEmpty()) {
            this.sweets = sweets;
        }else{
            this.sweets.addAll(sweets);
        }
        totalPrice=0.0;
        for(Sweetness candy:sweets){
            totalPrice+=candy.getPrice();
        }
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    @Override
    public String toString() {
        return "Package{" +
                "shape=" + shape.toString() +
                ", label='" + label + '\'' +
                ", sweets=" + sweets.toString() +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
