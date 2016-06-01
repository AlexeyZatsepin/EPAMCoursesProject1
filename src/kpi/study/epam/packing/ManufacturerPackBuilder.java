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
public class ManufacturerPackBuilder extends PackageBuilder{
    private Sweetness.Manufacturer manufacturer;

    public ManufacturerPackBuilder(Shape shape, List<Sweetness> sweets, Sweetness.Manufacturer manufacturer) {
        super(shape, sweets);
        this.manufacturer = manufacturer;
    }

    @Override
    public void buildLabel() {
        pack.setLabel("New Year from " +manufacturer.toString());
    }

    @Override
    public void buildSweets() {
        double sweetsVolume = 0.0;
        List<Sweetness> result = new ArrayList<>();
        while (shape.volume()>sweetsVolume) {
            for (Sweetness candy : sweets) {
                if ((candy instanceof Packable)&(shape.volume() > sweetsVolume) & (candy.getManufacturer().equals(manufacturer))) {
                    sweetsVolume += candy.getShape().volume();
                    result.add(candy);
                }
            }
        }
        pack.setSweets(result);
    }

    @Override
    public void buildShape() {
        pack.setShape(shape);
    }
}
