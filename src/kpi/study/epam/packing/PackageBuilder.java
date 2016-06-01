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
public abstract class PackageBuilder {
    protected Package pack;
    protected Shape shape;
    protected List<Sweetness> sweets=new ArrayList<>();

    public PackageBuilder(Shape shape, List<Sweetness> sweets) {
        this.shape = shape;
        this.sweets = sweets;
    }

    public Package getPack(){
        return pack;
    }
    public void createNewPackege(){
        pack = new Package();

    }
    public abstract void buildShape();
    public abstract void buildLabel();
    public abstract void buildSweets();
}
