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
public abstract class Sweetness {
    private Shape shape;
    private int price;
    private String label;
    private Manufacturer manufacturer;
    private Set<Ingridient> ingridients;

    public Sweetness(Shape shape, int price, String label, Manufacturer manufacturer, Set<Ingridient> ingridients) {
        this.shape = shape;
        this.price = price;
        this.label = label;
        this.manufacturer = manufacturer;
        this.ingridients = ingridients;
    }

    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Set<Ingridient> getIngridients() {
        return ingridients;
    }

    public void setIngridients(Set<Ingridient> ingridients) {
        this.ingridients = ingridients;
    }

    public enum Manufacturer {
        ROSHEN,AVK,LASUNKA,SVITOCH,KORONA,RUD
    }
    public void eatIt(){}

    double getWeight(){
        double weight=0.0;
        for (Ingridient item:ingridients) {
            weight += item.getWeight();
        }
        return weight;
    }

//    @Override
//    public String toString() {
//        return "Sweetness{" +
//                "shape=" + shape.toString() +
//                ", price=" + price +
//                ", label='" + label + '\'' +
//                ", manufacturer=" + manufacturer +
//                ", ingridients=" + ingridients.toString() +
//                '}';
//    }

    @Override
    public String toString() {
        return "glabel :"+label +" price :"+ price;
    }
}
