package kpi.study.epam.packing;

import kpi.study.epam.candies.NotPackableExeption;
import kpi.study.epam.candies.Packable;
import kpi.study.epam.candies.Sweetness;
import kpi.study.epam.figures.Shape;
import kpi.study.epam.ingredients.Ingridient;

import java.util.ArrayList;
import java.util.List;

/**
 * EPAM_Project1_NewYearSurprises
 * Created 6/1/16, with IntelliJ IDEA
 *
 * @author Alex
 */
public class Package { //Product analog, builder pattern
    private Shape shape;//shape
    private String label; // name of present
    private List<Sweetness> sweets = new ArrayList<>(); // list of sweets
    private double totalPrice = 0.0;

    /**
     * setters and getters block
     */
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

    /**
     * complex setter for
     * @param sweets list of existing sweets
     */
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

    /**
     *
     * @return total price
     */
    public double getTotalPrice() {
        return totalPrice;
    }

    /**
     *
     * @return proteins sum capacity(level) in package
     */
    private double getProteinsLevel(){
        double level = 0.0;
        for(Sweetness sweet: sweets){
            for (Ingridient ingridient:sweet.getIngridients()){
                level+= ingridient.getProteinsCapacity();
            }
        }
        return level;
    }

    /**
     *
     * @return fats sum capacity(level) in package
     */
    private double getFatsLevel(){
        double level = 0.0;
        for(Sweetness sweet: sweets){
            for (Ingridient ingridient:sweet.getIngridients()){
                level+= ingridient.getFatsCapacity();
            }
        }
        return level;
    }

    /**
     *
     * @return carbohydrates sum capacity(level) in package
     */
    private double getCarbohydratesLevel(){
        double level = 0.0;
        for(Sweetness sweet: sweets){
            for (Ingridient ingridient:sweet.getIngridients()){
                level+= ingridient.getCarbohydratesCapacity();
            }
        }
        return level;
    }

    /**
     * add one sweetness in package
     * @param sweet some sweet, that we want to add to our pack
     * @throws NotPackableExeption if we want pack some unpackeble item, like cheese cake
     * @throws PackageOutOfBoundsExeption if package is full
     */
    public void addSweet(Sweetness sweet) throws NotPackableExeption, PackageOutOfBoundsExeption {
        double sweetsVolume = 0.0;
        for (Sweetness candy : sweets) {
            sweetsVolume += candy.getShape().volume();
        }
        sweetsVolume += sweet.getShape().volume();
        if (shape.volume()>sweetsVolume) {
            if (sweet instanceof Packable) {
                sweets.add(sweet);
            } else {
                throw new NotPackableExeption("can't pack"+sweet);
            }
        }else{
            throw new PackageOutOfBoundsExeption("package is full");
        }
    }

    @Override
    public String toString() {
        return "Package:'" + label + '\'' + shape.toString() +
                ", totalPrice: " + totalPrice +
                ",\n" + "proteins:" + getProteinsLevel()
                +" fats: "+getFatsLevel()
                +" carbohydrates: "+ getCarbohydratesLevel()
                +",\n sweets=" + sweets.toString();

    }
}
